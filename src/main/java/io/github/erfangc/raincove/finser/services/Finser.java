package io.github.erfangc.raincove.finser.services;

import io.github.erfangc.raincove.finser.ApiException;
import io.github.erfangc.raincove.finser.models.*;
import io.github.erfangc.raincove.finser.repositories.cassandra.CompaniesRepository;
import io.github.erfangc.raincove.finser.repositories.cassandra.FinancialStatementRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.cassandra.core.mapping.BasicMapId;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class Finser {

    private static final Logger logger = LoggerFactory.getLogger(Finser.class);
    private FinancialStatementRepository statementRepository;
    private CompaniesRepository companiesRepository;
    private String anonymous;

    public Finser(FinancialStatementRepository statementRepository, CompaniesRepository companiesRepository) {
        this.statementRepository = statementRepository;
        this.companiesRepository = companiesRepository;
    }

    public CreateOrUpdateCompanyResponse createOrUpdateCompany(CreateOrUpdateCompanyRequest body, Principal principal) {
        final String now = Instant.now().toString();
        final Company company = body.getCompany();
        final String id = company.getId();

        final Optional<Company> existing = companiesRepository.findById(id);
        final String name = principal != null ? principal.getName() : anonymous;
        if (existing.isPresent()) {
            final Company old = existing.get();
            company.setCreatedBy(old.getCreatedBy());
            company.setCreatedOn(old.getCreatedOn());
            company.setUpdatedOn(now);
            company.setUpdatedBy(name);
            companiesRepository.save(company);
            logger.info("Updated company with id={}", id);
            return new CreateOrUpdateCompanyResponse().setMessage("Updated").setTimestamp(now);
        } else {
            company.setCreatedOn(now);
            company.setCreatedBy(name);
            companiesRepository.save(company);
            logger.info("Created company with id={}", id);
            return new CreateOrUpdateCompanyResponse().setMessage("Created").setTimestamp(now);
        }
    }

    public GetCompanyResponse getCompany(String id) {
        String now = Instant.now().toString();
        final Optional<Company> found = companiesRepository.findById(id);
        if (found.isPresent()) {
            return new GetCompanyResponse()
                    .setCompany(found.get())
                    .setTimestamp(now);
        } else {
            throw new ApiException()
                    .setHttpStatus(HttpStatus.BAD_REQUEST)
                    .setMessage("Company with id " + id + " cannot be found");
        }
    }

    public DeleteCompanyResponse deleteCompany(String id) {
        companiesRepository.deleteById(id);
        logger.info("Deleted company with id={}", id);
        return new DeleteCompanyResponse()
                .setMessage("Deleted")
                .setTimestamp(Instant.now().toString());
    }

    public GetFinancialStatementsResponse getFinancialStatements(String companyId) {
        final List<FinancialStatement> statements = statementRepository.findAllByCompanyId(companyId);
        return new GetFinancialStatementsResponse()
                .setFinancialStatements(statements);
    }

    public DeleteFinancialStatementsResponse deleteFinancialStatements(String companyId) {
        final GetFinancialStatementsResponse resp = getFinancialStatements(companyId);
        //
        // delete iteratively, this might need row locking in the future to prevent partial deletes and inconsistent data
        //
        final List<FinancialStatement> financialStatements = resp.getFinancialStatements();
        int deleteCount = 0;
        int failCount = 0;
        for (FinancialStatement statement : financialStatements) {
            try {
                final DeleteFinancialStatementResponse drsp = deleteFinancialStatement(companyId, statement.getId());
                deleteCount++;
            } catch (Exception e) {
                logger.error("Failed to delete financial statement id={}, companyId={}", statement.getId(), companyId);
                failCount++;
            }
        }
        final String now = Instant.now().toString();
        logger.info("Deleted financial statements with companyId={}, deleted={}, failed={}", companyId, deleteCount, failCount);
        return new DeleteFinancialStatementsResponse()
                .setMessage("Deleted " + deleteCount + " statements, " + failCount + " failed to delete")
                .setTimestamp(now);
    }

    public CreateOrUpdateFinancialStatementsResponse createOrUpdateFinancialStatements(CreateOrUpdateFinancialStatementsRequest body, String companyId, Principal principal) {
        final String now = Instant.now().toString();
        final List<FinancialStatement> financialStatements = body.getFinancialStatements();
        int succeed = 0, failed = 0, created = 0, updated = 0;
        for (FinancialStatement financialStatement : financialStatements) {
            try {
                final Optional<FinancialStatement> existing = statementRepository.findById(BasicMapId.id("companyId", companyId).with("id", financialStatement.getId()));
                final String name = principal != null ? principal.getName() : anonymous;
                if (existing.isPresent()) {
                    final FinancialStatement old = existing.get();
                    financialStatement.setCreatedBy(old.getCreatedBy());
                    financialStatement.setCreatedOn(old.getCreatedOn());
                    financialStatement.setUpdatedOn(now);
                    financialStatement.setUpdatedBy(name);
                    statementRepository.save(financialStatement);
                    updated++;
                } else {
                    financialStatement.setCreatedOn(now);
                    financialStatement.setCreatedBy(name);
                    statementRepository.save(financialStatement);
                    created++;
                }
            } catch (Exception e) {
                logger.error("Failed to create / update financial statement id={}, companyId={}, reason={}", financialStatement.getId(), companyId, e.getMessage());
                failed++;
            }
            succeed++;
        }
        logger.info("Upserted financial statements for companyId={}, succeed={}, failed={}, updated={}, created={}", companyId, succeed, failed, updated, created);
        return new CreateOrUpdateFinancialStatementsResponse()
                .setMessage("Created " + created + ", updated " + updated + ", succeed " + succeed + ", failed " + failed)
                .setTimestamp(now);
    }

    public GetFinancialStatementResponse getFinancialStatement(String companyId, String id) {
        final Optional<FinancialStatement> found = statementRepository.findById(BasicMapId.id("companyId", companyId).with("id", id));
        String now = Instant.now().toString();
        if (found.isPresent()) {
            return new GetFinancialStatementResponse()
                    .setFinancialStatement(found.get())
                    .setTimestamp(now);
        } else {
            throw new ApiException()
                    .setHttpStatus(HttpStatus.BAD_REQUEST)
                    .setMessage("Financial statement with id " + id + " for company " + companyId + " cannot be found");
        }
    }

    public DeleteFinancialStatementResponse deleteFinancialStatement(String companyId, String id) {
        statementRepository.deleteById(BasicMapId.id("companyId", companyId).with("id", id));
        logger.error("Deleted financial statement with id={}, companyId={}", id, companyId);
        String now = Instant.now().toString();
        return new DeleteFinancialStatementResponse()
                .setMessage("Deleted")
                .setTimestamp(now);
    }

    public SearchFinancialStatementsResponse searchFinancialStatements(SearchFinancialStatementsRequest body) {
        throw new UnsupportedOperationException();
    }
}

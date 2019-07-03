package io.github.erfangc.raincove.finser.controllers;

import io.github.erfangc.raincove.finser.models.*;
import io.github.erfangc.raincove.finser.services.Finser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/finser/api/v1")
public class FinserController {
    private static final Logger logger = LoggerFactory.getLogger(FinserController.class);
    private Finser finser;

    public FinserController(Finser finser) {
        this.finser = finser;
    }

    @RequestMapping(method = POST, path = "/companies")
    public CreateOrUpdateCompanyResponse createOrUpdateCompany(@RequestBody CreateOrUpdateCompanyRequest body,
                                                               HttpServletRequest request) {
        logger.info("Handling operation {}", "createOrUpdateCompany");
        String user = request.getHeader("X-Forwarded-User");
        final CreateOrUpdateCompanyResponse response = finser.createOrUpdateCompany(body, user);
        logger.info("Finished handling operation {}", "createOrUpdateCompany");
        return response;
    }

    @RequestMapping(method = GET, path = "/companies/{id}")
    public GetCompanyResponse getCompany(@PathVariable String id) {
        logger.info("Handling operation {}", "getCompany");
        GetCompanyResponse response = finser.getCompany(id);
        logger.info("Finished handling operation {}", "getCompany");
        return response;
    }

    @RequestMapping(method = DELETE, path = "/companies/{id}")
    public DeleteCompanyResponse deleteCompany(@PathVariable String id) {
        logger.info("Handling operation {}", "deleteCompany");
        DeleteCompanyResponse response = finser.deleteCompany(id);
        logger.info("Finished handling operation {}", "deleteCompany");
        return response;
    }

    @RequestMapping(method = GET, path = "/companies/{companyId}/financial-statements")
    public GetFinancialStatementsResponse getFinancialStatements(@PathVariable String companyId) {
        logger.info("Handling operation {}", "getFinancialStatements");
        GetFinancialStatementsResponse response = finser.getFinancialStatements(companyId);
        logger.info("Finished handling operation {}", "getFinancialStatements");
        return response;
    }

    @RequestMapping(method = DELETE, path = "/companies/{companyId}/financial-statements")
    public DeleteFinancialStatementsResponse deleteFinancialStatements(@PathVariable String companyId) {
        logger.info("Handling operation {}", "deleteFinancialStatements");
        DeleteFinancialStatementsResponse response = finser.deleteFinancialStatements(companyId);
        logger.info("Finished handling operation {}", "deleteFinancialStatements");
        return response;
    }

    @RequestMapping(method = POST, path = "/companies/{companyId}/financial-statements")
    public CreateOrUpdateFinancialStatementsResponse createOrUpdateFinancialStatements(@RequestBody CreateOrUpdateFinancialStatementsRequest body, @PathVariable String companyId, HttpServletRequest request) {
        logger.info("Handling operation {}", "createOrUpdateFinancialStatements");
        String user = request.getHeader("X-Forwarded-User");
        CreateOrUpdateFinancialStatementsResponse response = finser.createOrUpdateFinancialStatements(body, companyId, user);
        logger.info("Finished handling operation {}", "createOrUpdateFinancialStatements");
        return response;
    }

    @RequestMapping(method = GET, path = "/companies/{companyId}/financial-statements/{id}")
    public GetFinancialStatementResponse getFinancialStatement(@PathVariable String companyId, @PathVariable String id) {
        logger.info("Handling operation {}", "getFinancialStatement");
        GetFinancialStatementResponse response = finser.getFinancialStatement(companyId, id);
        logger.info("Finished handling operation {}", "getFinancialStatement");
        return response;
    }

    @RequestMapping(method = DELETE, path = "/companies/{companyId}/financial-statements/{id}")
    public DeleteFinancialStatementResponse deleteFinancialStatement(@PathVariable String companyId, @PathVariable String id) {
        logger.info("Handling operation {}", "deleteFinancialStatement");
        DeleteFinancialStatementResponse response = finser.deleteFinancialStatement(companyId, id);
        logger.info("Finished handling operation {}", "deleteFinancialStatement");
        return response;
    }

    @RequestMapping(method = POST, path = "/companies/financial-statements/_search")
    public SearchFinancialStatementsResponse searchFinancialStatements(@RequestBody SearchFinancialStatementsRequest body) {
        logger.info("Handling operation {}", "searchFinancialStatements");
        SearchFinancialStatementsResponse response = finser.searchFinancialStatements(body);
        logger.info("Finished handling operation {}", "searchFinancialStatements");
        return response;
    }

}

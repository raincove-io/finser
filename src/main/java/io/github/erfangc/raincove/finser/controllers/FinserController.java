package io.github.erfangc.raincove.finser.controllers;

import io.github.erfangc.raincove.finser.models.*;
import io.github.erfangc.raincove.finser.services.Finser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class FinserController {
    private Finser finser;

    public FinserController(Finser finser) {
        this.finser = finser;
    }

    @RequestMapping(method = POST, path = "/companies")
    public CreateOrUpdateCompanyResponse createOrUpdateCompany(@RequestBody CreateOrUpdateCompanyRequest body,
                                                               Principal principal) {
        return finser.createOrUpdateCompany(body, principal);
    }

    @RequestMapping(method = GET, path = "/companies/{id}")
    public GetCompanyResponse getCompany(@PathVariable String id) {
        return finser.getCompany(id);
    }

    @RequestMapping(method = DELETE, path = "/companies/{id}")
    public DeleteCompanyResponse deleteCompany(@PathVariable String id) {
        return finser.deleteCompany(id);
    }

    @RequestMapping(method = GET, path = "/companies/{companyId}/financial-statements")
    public GetFinancialStatementsResponse getFinancialStatements(@PathVariable String companyId) {
        return finser.getFinancialStatements(companyId);
    }

    @RequestMapping(method = DELETE, path = "/companies/{companyId}/financial-statements")
    public DeleteFinancialStatementsResponse deleteFinancialStatements(@PathVariable String companyId) {
        return finser.deleteFinancialStatements(companyId);
    }

    @RequestMapping(method = POST, path = "/companies/{companyId}/financial-statements")
    public CreateOrUpdateFinancialStatementsResponse createOrUpdateFinancialStatements(@RequestBody CreateOrUpdateFinancialStatementsRequest body, @PathVariable String companyId, Principal principal) {
        return finser.createOrUpdateFinancialStatements(body, companyId, principal);
    }

    @RequestMapping(method = GET, path = "/companies/{companyId}/financial-statements/{id}")
    public GetFinancialStatementResponse getFinancialStatement(@PathVariable String companyId, @PathVariable String id) {
        return finser.getFinancialStatement(companyId, id);
    }

    @RequestMapping(method = DELETE, path = "/companies/{companyId}/financial-statements/{id}")
    public DeleteFinancialStatementResponse deleteFinancialStatement(@PathVariable String companyId, @PathVariable String id) {
        return finser.deleteFinancialStatement(companyId, id);
    }

    @RequestMapping(method = POST, path = "/companies/financial-statements/_search")
    public SearchFinancialStatementsResponse searchFinancialStatements(@RequestBody SearchFinancialStatementsRequest body) {
        return finser.searchFinancialStatements(body);
    }

}

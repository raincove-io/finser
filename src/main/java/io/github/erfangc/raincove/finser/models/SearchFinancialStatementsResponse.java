package io.github.erfangc.raincove.finser.models;

import java.util.List;

public class SearchFinancialStatementsResponse {

    private List<FinancialStatement> financialStatements;

    public List<FinancialStatement> getFinancialStatements() {
        return this.financialStatements;
    }

    public SearchFinancialStatementsResponse setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }

}
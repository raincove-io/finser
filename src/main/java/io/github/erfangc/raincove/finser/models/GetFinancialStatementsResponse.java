package io.github.erfangc.raincove.finser.models;

import java.util.List;

public class GetFinancialStatementsResponse {

    private List<FinancialStatement> financialStatements;

    public List<FinancialStatement> getFinancialStatements() {
        return this.financialStatements;
    }

    public GetFinancialStatementsResponse setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }

}
package io.github.erfangc.raincove.finser.models;

import java.util.List;

public class CreateFinancialStatementsRequest {

    private List<FinancialStatement> financialStatements;

    public List<FinancialStatement> getFinancialStatements() {
        return this.financialStatements;
    }

    public CreateFinancialStatementsRequest setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }

}
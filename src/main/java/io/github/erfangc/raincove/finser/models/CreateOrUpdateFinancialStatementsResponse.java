package io.github.erfangc.raincove.finser.models;

import java.util.List;

public class CreateOrUpdateFinancialStatementsResponse {

    private List<FinancialStatement> financialStatements;
    private String message;
    private String timestamp;

    public List<FinancialStatement> getFinancialStatements() {
        return this.financialStatements;
    }

    public CreateOrUpdateFinancialStatementsResponse setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateFinancialStatementsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateOrUpdateFinancialStatementsResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
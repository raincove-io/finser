package io.github.erfangc.raincove.finser.models;

import java.util.List;

public class CreateFinancialStatementsResponse {

    private List<FinancialStatement> financialStatements;
    private String message;
    private String timestamp;

    public List<FinancialStatement> getFinancialStatements() {
        return this.financialStatements;
    }

    public CreateFinancialStatementsResponse setFinancialStatements(List<FinancialStatement> financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public CreateFinancialStatementsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateFinancialStatementsResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
package io.github.erfangc.raincove.finser.models;


public class GetFinancialStatementResponse {

    private FinancialStatement financialStatement;
    private String message;
    private String timestamp;

    public FinancialStatement getFinancialStatement() {
        return this.financialStatement;
    }

    public GetFinancialStatementResponse setFinancialStatement(FinancialStatement financialStatement) {
        this.financialStatement = financialStatement;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public GetFinancialStatementResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public GetFinancialStatementResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
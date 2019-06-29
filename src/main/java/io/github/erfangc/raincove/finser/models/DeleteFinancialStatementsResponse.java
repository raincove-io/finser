package io.github.erfangc.raincove.finser.models;


public class DeleteFinancialStatementsResponse {

    private String message;
    private String timestamp;

    public String getMessage() {
        return this.message;
    }

    public DeleteFinancialStatementsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public DeleteFinancialStatementsResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
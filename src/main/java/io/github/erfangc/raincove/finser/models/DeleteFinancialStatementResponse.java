package io.github.erfangc.raincove.finser.models;


public class DeleteFinancialStatementResponse {

    private String message;
    private String timestamp;

    public String getMessage() {
        return this.message;
    }

    public DeleteFinancialStatementResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public DeleteFinancialStatementResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
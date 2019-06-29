package io.github.erfangc.raincove.finser.models;


public class DeleteCompanyResponse {

    private String message;
    private String timestamp;

    public String getMessage() {
        return this.message;
    }

    public DeleteCompanyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public DeleteCompanyResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
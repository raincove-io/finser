package io.github.erfangc.raincove.finser.models;


public class CreateOrUpdateCompanyResponse {

    private String message;
    private String timestamp;

    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateCompanyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateOrUpdateCompanyResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
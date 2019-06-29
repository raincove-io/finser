package io.github.erfangc.raincove.finser.models;


public class CreateCompanyResponse {

    private String message;
    private String timestamp;

    public String getMessage() {
        return this.message;
    }

    public CreateCompanyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateCompanyResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
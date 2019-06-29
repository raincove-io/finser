package io.github.erfangc.raincove.finser.models;


public class GetCompanyResponse {

    private Company company;
    private String message;
    private String timestamp;

    public Company getCompany() {
        return this.company;
    }

    public GetCompanyResponse setCompany(Company company) {
        this.company = company;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public GetCompanyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public GetCompanyResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
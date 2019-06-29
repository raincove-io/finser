package io.github.erfangc.raincove.finser.models;


public class CreateCompanyRequest {

    private Company company;

    public Company getCompany() {
        return this.company;
    }

    public CreateCompanyRequest setCompany(Company company) {
        this.company = company;
        return this;
    }

}
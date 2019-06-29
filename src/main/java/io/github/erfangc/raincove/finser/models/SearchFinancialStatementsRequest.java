package io.github.erfangc.raincove.finser.models;


public class SearchFinancialStatementsRequest {

    private String start;
    private String end;
    private String filingType;
    private String companyId;

    public String getStart() {
        return this.start;
    }

    public SearchFinancialStatementsRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return this.end;
    }

    public SearchFinancialStatementsRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getFilingType() {
        return this.filingType;
    }

    public SearchFinancialStatementsRequest setFilingType(String filingType) {
        this.filingType = filingType;
        return this;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public SearchFinancialStatementsRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

}
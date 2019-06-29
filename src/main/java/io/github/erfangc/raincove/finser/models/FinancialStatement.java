package io.github.erfangc.raincove.finser.models;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class FinancialStatement {

    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private String companyId;
    @PrimaryKeyColumn
    private String id;
    private String filingType;
    private String url;
    private String date;
    private String createdOn;
    private String createdBy;
    private String updatedOn;
    private String updatedBy;
    private IncomeStatement incomeStatement;
    private BalanceSheet balanceSheet;
    private CashflowStatement cashflowStatement;

    public String getCompanyId() {
        return this.companyId;
    }

    public FinancialStatement setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public FinancialStatement setId(String id) {
        this.id = id;
        return this;
    }

    public String getFilingType() {
        return this.filingType;
    }

    public FinancialStatement setFilingType(String filingType) {
        this.filingType = filingType;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public FinancialStatement setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public FinancialStatement setDate(String date) {
        this.date = date;
        return this;
    }

    public String getCreatedOn() {
        return this.createdOn;
    }

    public FinancialStatement setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public FinancialStatement setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getUpdatedOn() {
        return this.updatedOn;
    }

    public FinancialStatement setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public FinancialStatement setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public IncomeStatement getIncomeStatement() {
        return this.incomeStatement;
    }

    public FinancialStatement setIncomeStatement(IncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
        return this;
    }

    public BalanceSheet getBalanceSheet() {
        return this.balanceSheet;
    }

    public FinancialStatement setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
        return this;
    }

    public CashflowStatement getCashflowStatement() {
        return this.cashflowStatement;
    }

    public FinancialStatement setCashflowStatement(CashflowStatement cashflowStatement) {
        this.cashflowStatement = cashflowStatement;
        return this;
    }

}
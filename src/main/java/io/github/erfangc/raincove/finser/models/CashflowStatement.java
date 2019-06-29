package io.github.erfangc.raincove.finser.models;


import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class CashflowStatement {

    private Double netIncome;
    private Double depreciation;
    private Double adjustmentsToNetIncome;
    private Double changesInAccountsReceivables;
    private Double changesInLiabilities;
    private Double changesInInventories;
    private Double changesInOtherOperatingActivities;
    private Double totalCashFlowFromOperatingActivities;
    private Double capitalExpenditures;
    private Double investments;
    private Double otherCashFlowsFromInvestingActivities;
    private Double totalCashFlowsFromInvestingActivities;
    private Double dividendsPaid;
    private Double netBorrowings;
    private Double totalCashFlowsFromFinancingActivities;
    private Double changeInCashAndCashEquivalents;

    public Double getNetIncome() {
        return this.netIncome;
    }

    public CashflowStatement setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    public Double getDepreciation() {
        return this.depreciation;
    }

    public CashflowStatement setDepreciation(Double depreciation) {
        this.depreciation = depreciation;
        return this;
    }

    public Double getAdjustmentsToNetIncome() {
        return this.adjustmentsToNetIncome;
    }

    public CashflowStatement setAdjustmentsToNetIncome(Double adjustmentsToNetIncome) {
        this.adjustmentsToNetIncome = adjustmentsToNetIncome;
        return this;
    }

    public Double getChangesInAccountsReceivables() {
        return this.changesInAccountsReceivables;
    }

    public CashflowStatement setChangesInAccountsReceivables(Double changesInAccountsReceivables) {
        this.changesInAccountsReceivables = changesInAccountsReceivables;
        return this;
    }

    public Double getChangesInLiabilities() {
        return this.changesInLiabilities;
    }

    public CashflowStatement setChangesInLiabilities(Double changesInLiabilities) {
        this.changesInLiabilities = changesInLiabilities;
        return this;
    }

    public Double getChangesInInventories() {
        return this.changesInInventories;
    }

    public CashflowStatement setChangesInInventories(Double changesInInventories) {
        this.changesInInventories = changesInInventories;
        return this;
    }

    public Double getChangesInOtherOperatingActivities() {
        return this.changesInOtherOperatingActivities;
    }

    public CashflowStatement setChangesInOtherOperatingActivities(Double changesInOtherOperatingActivities) {
        this.changesInOtherOperatingActivities = changesInOtherOperatingActivities;
        return this;
    }

    public Double getTotalCashFlowFromOperatingActivities() {
        return this.totalCashFlowFromOperatingActivities;
    }

    public CashflowStatement setTotalCashFlowFromOperatingActivities(Double totalCashFlowFromOperatingActivities) {
        this.totalCashFlowFromOperatingActivities = totalCashFlowFromOperatingActivities;
        return this;
    }

    public Double getCapitalExpenditures() {
        return this.capitalExpenditures;
    }

    public CashflowStatement setCapitalExpenditures(Double capitalExpenditures) {
        this.capitalExpenditures = capitalExpenditures;
        return this;
    }

    public Double getInvestments() {
        return this.investments;
    }

    public CashflowStatement setInvestments(Double investments) {
        this.investments = investments;
        return this;
    }

    public Double getOtherCashFlowsFromInvestingActivities() {
        return this.otherCashFlowsFromInvestingActivities;
    }

    public CashflowStatement setOtherCashFlowsFromInvestingActivities(Double otherCashFlowsFromInvestingActivities) {
        this.otherCashFlowsFromInvestingActivities = otherCashFlowsFromInvestingActivities;
        return this;
    }

    public Double getTotalCashFlowsFromInvestingActivities() {
        return this.totalCashFlowsFromInvestingActivities;
    }

    public CashflowStatement setTotalCashFlowsFromInvestingActivities(Double totalCashFlowsFromInvestingActivities) {
        this.totalCashFlowsFromInvestingActivities = totalCashFlowsFromInvestingActivities;
        return this;
    }

    public Double getDividendsPaid() {
        return this.dividendsPaid;
    }

    public CashflowStatement setDividendsPaid(Double dividendsPaid) {
        this.dividendsPaid = dividendsPaid;
        return this;
    }

    public Double getNetBorrowings() {
        return this.netBorrowings;
    }

    public CashflowStatement setNetBorrowings(Double netBorrowings) {
        this.netBorrowings = netBorrowings;
        return this;
    }

    public Double getTotalCashFlowsFromFinancingActivities() {
        return this.totalCashFlowsFromFinancingActivities;
    }

    public CashflowStatement setTotalCashFlowsFromFinancingActivities(Double totalCashFlowsFromFinancingActivities) {
        this.totalCashFlowsFromFinancingActivities = totalCashFlowsFromFinancingActivities;
        return this;
    }

    public Double getChangeInCashAndCashEquivalents() {
        return this.changeInCashAndCashEquivalents;
    }

    public CashflowStatement setChangeInCashAndCashEquivalents(Double changeInCashAndCashEquivalents) {
        this.changeInCashAndCashEquivalents = changeInCashAndCashEquivalents;
        return this;
    }

}
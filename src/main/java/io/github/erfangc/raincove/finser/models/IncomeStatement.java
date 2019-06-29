package io.github.erfangc.raincove.finser.models;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class IncomeStatement {

    private Double totalRevenue;
    private Double costOfRevenue;
    private Double grossProfit;
    private Double researchDevelopment;
    private Double sellingGeneralAndAdministrative;
    private Double totalOperatingExpenses;
    private Double operatingIncomeOrLoss;
    private Double totalOtherIncomeOrExpensesNet;
    private Double earningsBeforeInterestAndTaxes;
    private Double interestExpense;
    private Double incomeBeforeTax;
    private Double incomeTaxExpense;
    private Double netIncomeFromContinuingOps;
    private Double netIncome;
    private Double netIncomeApplicableToCommonShares;

    public Double getTotalRevenue() {
        return this.totalRevenue;
    }

    public IncomeStatement setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
        return this;
    }

    public Double getCostOfRevenue() {
        return this.costOfRevenue;
    }

    public IncomeStatement setCostOfRevenue(Double costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
        return this;
    }

    public Double getGrossProfit() {
        return this.grossProfit;
    }

    public IncomeStatement setGrossProfit(Double grossProfit) {
        this.grossProfit = grossProfit;
        return this;
    }

    public Double getResearchDevelopment() {
        return this.researchDevelopment;
    }

    public IncomeStatement setResearchDevelopment(Double researchDevelopment) {
        this.researchDevelopment = researchDevelopment;
        return this;
    }

    public Double getSellingGeneralAndAdministrative() {
        return this.sellingGeneralAndAdministrative;
    }

    public IncomeStatement setSellingGeneralAndAdministrative(Double sellingGeneralAndAdministrative) {
        this.sellingGeneralAndAdministrative = sellingGeneralAndAdministrative;
        return this;
    }

    public Double getTotalOperatingExpenses() {
        return this.totalOperatingExpenses;
    }

    public IncomeStatement setTotalOperatingExpenses(Double totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
        return this;
    }

    public Double getOperatingIncomeOrLoss() {
        return this.operatingIncomeOrLoss;
    }

    public IncomeStatement setOperatingIncomeOrLoss(Double operatingIncomeOrLoss) {
        this.operatingIncomeOrLoss = operatingIncomeOrLoss;
        return this;
    }

    public Double getTotalOtherIncomeOrExpensesNet() {
        return this.totalOtherIncomeOrExpensesNet;
    }

    public IncomeStatement setTotalOtherIncomeOrExpensesNet(Double totalOtherIncomeOrExpensesNet) {
        this.totalOtherIncomeOrExpensesNet = totalOtherIncomeOrExpensesNet;
        return this;
    }

    public Double getEarningsBeforeInterestAndTaxes() {
        return this.earningsBeforeInterestAndTaxes;
    }

    public IncomeStatement setEarningsBeforeInterestAndTaxes(Double earningsBeforeInterestAndTaxes) {
        this.earningsBeforeInterestAndTaxes = earningsBeforeInterestAndTaxes;
        return this;
    }

    public Double getInterestExpense() {
        return this.interestExpense;
    }

    public IncomeStatement setInterestExpense(Double interestExpense) {
        this.interestExpense = interestExpense;
        return this;
    }

    public Double getIncomeBeforeTax() {
        return this.incomeBeforeTax;
    }

    public IncomeStatement setIncomeBeforeTax(Double incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
        return this;
    }

    public Double getIncomeTaxExpense() {
        return this.incomeTaxExpense;
    }

    public IncomeStatement setIncomeTaxExpense(Double incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
        return this;
    }

    public Double getNetIncomeFromContinuingOps() {
        return this.netIncomeFromContinuingOps;
    }

    public IncomeStatement setNetIncomeFromContinuingOps(Double netIncomeFromContinuingOps) {
        this.netIncomeFromContinuingOps = netIncomeFromContinuingOps;
        return this;
    }

    public Double getNetIncome() {
        return this.netIncome;
    }

    public IncomeStatement setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    public Double getNetIncomeApplicableToCommonShares() {
        return this.netIncomeApplicableToCommonShares;
    }

    public IncomeStatement setNetIncomeApplicableToCommonShares(Double netIncomeApplicableToCommonShares) {
        this.netIncomeApplicableToCommonShares = netIncomeApplicableToCommonShares;
        return this;
    }

}
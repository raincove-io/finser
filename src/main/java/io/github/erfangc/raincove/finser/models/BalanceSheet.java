package io.github.erfangc.raincove.finser.models;


import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class BalanceSheet {

    private Double cashAndCashEquivalents;
    private Double shortTermInvestments;
    private Double netReceivables;
    private Double inventory;
    private Double otherCurrentAssets;
    private Double totalCurrentAssets;
    private Double longTermInvestments;
    private Double propertyPlantAndEquipment;
    private Double otherAssets;
    private Double totalAssets;
    private Double capitaSurplus;
    private Double accountsPayable;
    private Double shortOrCurrentLongTermDebt;
    private Double otherCurrentLiabilities;
    private Double totalCurrentLiabilities;
    private Double longTermDebt;
    private Double otherLiabilities;
    private Double totalLiabilities;
    private Double commonStock;
    private Double retainedEarnings;
    private Double treasuryStock;
    private Double otherStockholderEquity;
    private Double totalStockholderEquity;
    private Double netTangibleAssets;
    private Double goodwill;
    private Double intangibleAssets;
    private Double accumulatedAmortization;
    private Double deferredLongTermAssetCharges;
    private Double redeemablePreferredStock;
    private Double deferredLongTermLiabilityCharges;
    private Double minorityInterest;
    private Double negativeGoodwill;

    public Double getCashAndCashEquivalents() {
        return this.cashAndCashEquivalents;
    }

    public BalanceSheet setCashAndCashEquivalents(Double cashAndCashEquivalents) {
        this.cashAndCashEquivalents = cashAndCashEquivalents;
        return this;
    }

    public Double getShortTermInvestments() {
        return this.shortTermInvestments;
    }

    public BalanceSheet setShortTermInvestments(Double shortTermInvestments) {
        this.shortTermInvestments = shortTermInvestments;
        return this;
    }

    public Double getNetReceivables() {
        return this.netReceivables;
    }

    public BalanceSheet setNetReceivables(Double netReceivables) {
        this.netReceivables = netReceivables;
        return this;
    }

    public Double getInventory() {
        return this.inventory;
    }

    public BalanceSheet setInventory(Double inventory) {
        this.inventory = inventory;
        return this;
    }

    public Double getOtherCurrentAssets() {
        return this.otherCurrentAssets;
    }

    public BalanceSheet setOtherCurrentAssets(Double otherCurrentAssets) {
        this.otherCurrentAssets = otherCurrentAssets;
        return this;
    }

    public Double getTotalCurrentAssets() {
        return this.totalCurrentAssets;
    }

    public BalanceSheet setTotalCurrentAssets(Double totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
        return this;
    }

    public Double getLongTermInvestments() {
        return this.longTermInvestments;
    }

    public BalanceSheet setLongTermInvestments(Double longTermInvestments) {
        this.longTermInvestments = longTermInvestments;
        return this;
    }

    public Double getPropertyPlantAndEquipment() {
        return this.propertyPlantAndEquipment;
    }

    public BalanceSheet setPropertyPlantAndEquipment(Double propertyPlantAndEquipment) {
        this.propertyPlantAndEquipment = propertyPlantAndEquipment;
        return this;
    }

    public Double getOtherAssets() {
        return this.otherAssets;
    }

    public BalanceSheet setOtherAssets(Double otherAssets) {
        this.otherAssets = otherAssets;
        return this;
    }

    public Double getTotalAssets() {
        return this.totalAssets;
    }

    public BalanceSheet setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }

    public Double getCapitaSurplus() {
        return this.capitaSurplus;
    }

    public BalanceSheet setCapitaSurplus(Double capitaSurplus) {
        this.capitaSurplus = capitaSurplus;
        return this;
    }

    public Double getAccountsPayable() {
        return this.accountsPayable;
    }

    public BalanceSheet setAccountsPayable(Double accountsPayable) {
        this.accountsPayable = accountsPayable;
        return this;
    }

    public Double getShortOrCurrentLongTermDebt() {
        return this.shortOrCurrentLongTermDebt;
    }

    public BalanceSheet setShortOrCurrentLongTermDebt(Double shortOrCurrentLongTermDebt) {
        this.shortOrCurrentLongTermDebt = shortOrCurrentLongTermDebt;
        return this;
    }

    public Double getOtherCurrentLiabilities() {
        return this.otherCurrentLiabilities;
    }

    public BalanceSheet setOtherCurrentLiabilities(Double otherCurrentLiabilities) {
        this.otherCurrentLiabilities = otherCurrentLiabilities;
        return this;
    }

    public Double getTotalCurrentLiabilities() {
        return this.totalCurrentLiabilities;
    }

    public BalanceSheet setTotalCurrentLiabilities(Double totalCurrentLiabilities) {
        this.totalCurrentLiabilities = totalCurrentLiabilities;
        return this;
    }

    public Double getLongTermDebt() {
        return this.longTermDebt;
    }

    public BalanceSheet setLongTermDebt(Double longTermDebt) {
        this.longTermDebt = longTermDebt;
        return this;
    }

    public Double getOtherLiabilities() {
        return this.otherLiabilities;
    }

    public BalanceSheet setOtherLiabilities(Double otherLiabilities) {
        this.otherLiabilities = otherLiabilities;
        return this;
    }

    public Double getTotalLiabilities() {
        return this.totalLiabilities;
    }

    public BalanceSheet setTotalLiabilities(Double totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
        return this;
    }

    public Double getCommonStock() {
        return this.commonStock;
    }

    public BalanceSheet setCommonStock(Double commonStock) {
        this.commonStock = commonStock;
        return this;
    }

    public Double getRetainedEarnings() {
        return this.retainedEarnings;
    }

    public BalanceSheet setRetainedEarnings(Double retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
        return this;
    }

    public Double getTreasuryStock() {
        return this.treasuryStock;
    }

    public BalanceSheet setTreasuryStock(Double treasuryStock) {
        this.treasuryStock = treasuryStock;
        return this;
    }

    public Double getOtherStockholderEquity() {
        return this.otherStockholderEquity;
    }

    public BalanceSheet setOtherStockholderEquity(Double otherStockholderEquity) {
        this.otherStockholderEquity = otherStockholderEquity;
        return this;
    }

    public Double getTotalStockholderEquity() {
        return this.totalStockholderEquity;
    }

    public BalanceSheet setTotalStockholderEquity(Double totalStockholderEquity) {
        this.totalStockholderEquity = totalStockholderEquity;
        return this;
    }

    public Double getNetTangibleAssets() {
        return this.netTangibleAssets;
    }

    public BalanceSheet setNetTangibleAssets(Double netTangibleAssets) {
        this.netTangibleAssets = netTangibleAssets;
        return this;
    }

    public Double getGoodwill() {
        return this.goodwill;
    }

    public BalanceSheet setGoodwill(Double goodwill) {
        this.goodwill = goodwill;
        return this;
    }

    public Double getIntangibleAssets() {
        return this.intangibleAssets;
    }

    public BalanceSheet setIntangibleAssets(Double intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
        return this;
    }

    public Double getAccumulatedAmortization() {
        return this.accumulatedAmortization;
    }

    public BalanceSheet setAccumulatedAmortization(Double accumulatedAmortization) {
        this.accumulatedAmortization = accumulatedAmortization;
        return this;
    }

    public Double getDeferredLongTermAssetCharges() {
        return this.deferredLongTermAssetCharges;
    }

    public BalanceSheet setDeferredLongTermAssetCharges(Double deferredLongTermAssetCharges) {
        this.deferredLongTermAssetCharges = deferredLongTermAssetCharges;
        return this;
    }

    public Double getRedeemablePreferredStock() {
        return this.redeemablePreferredStock;
    }

    public BalanceSheet setRedeemablePreferredStock(Double redeemablePreferredStock) {
        this.redeemablePreferredStock = redeemablePreferredStock;
        return this;
    }

    public Double getDeferredLongTermLiabilityCharges() {
        return this.deferredLongTermLiabilityCharges;
    }

    public BalanceSheet setDeferredLongTermLiabilityCharges(Double deferredLongTermLiabilityCharges) {
        this.deferredLongTermLiabilityCharges = deferredLongTermLiabilityCharges;
        return this;
    }

    public Double getMinorityInterest() {
        return this.minorityInterest;
    }

    public BalanceSheet setMinorityInterest(Double minorityInterest) {
        this.minorityInterest = minorityInterest;
        return this;
    }

    public Double getNegativeGoodwill() {
        return this.negativeGoodwill;
    }

    public BalanceSheet setNegativeGoodwill(Double negativeGoodwill) {
        this.negativeGoodwill = negativeGoodwill;
        return this;
    }

}
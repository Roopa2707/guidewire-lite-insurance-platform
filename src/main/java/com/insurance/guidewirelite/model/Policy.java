package com.insurance.guidewirelite.model;

public class Policy {
    private String policyNumber;
    private String insuredName;
    private String productType; // Auto/Home/etc
    private double premium;
    private String status; // Active, Cancelled, etc.

    public Policy() {}
    public Policy(String policyNumber, String insuredName, String productType, double premium, String status) {
        this.policyNumber = policyNumber;
        this.insuredName = insuredName;
        this.productType = productType;
        this.premium = premium;
        this.status = status;
    }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getInsuredName() { return insuredName; }
    public void setInsuredName(String insuredName) { this.insuredName = insuredName; }
    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }
    public double getPremium() { return premium; }
    public void setPremium(double premium) { this.premium = premium; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

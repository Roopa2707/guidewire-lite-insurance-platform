package com.insurance.guidewirelite.model;

public class Claim {
    private String claimId;
    private String policyNumber;
    private double claimAmount;
    private String description;
    private String status; // Approved / Pending Review

    public Claim() {}
    public Claim(String claimId, String policyNumber, double claimAmount, String description, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.description = description;
        this.status = status;
    }
    public String getClaimId() { return claimId; }
    public void setClaimId(String claimId) { this.claimId = claimId; }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public double getClaimAmount() { return claimAmount; }
    public void setClaimAmount(double claimAmount) { this.claimAmount = claimAmount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

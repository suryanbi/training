package com.training.model;

public abstract class Insurance {
	
	private int policyNumber;
	private String policyHolderName;
	private double premium;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHolderName) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	public abstract double calculatePremium();
	
	

}

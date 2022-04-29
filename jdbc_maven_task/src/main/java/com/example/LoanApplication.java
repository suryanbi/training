package com.example;

public class LoanApplication {
	
	private int applicationNumber;
	private Customer customer;
	private int loanAmount;
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApplication(int applicationNumber, Customer customer, int loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer = customer;
		this.loanAmount = loanAmount;
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	
	

}

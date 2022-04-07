package com.training.model;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	private String accountType;
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Zero arg constructor of super class called");
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		System.out.println("Three arg constructor of super class called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		System.out.println("Four arg constructor of super class called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
//		return this.accountNumber+","+this.accountHolderName+","+this.balance+","+this.accountType;
		return super.toString()+ this.accountNumber+","+this.accountHolderName+","+this.balance+","+this.accountType;

	}
	
	

}

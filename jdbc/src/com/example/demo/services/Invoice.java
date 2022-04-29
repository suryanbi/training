package com.example.demo.services;

public class Invoice {
	
	private int invoiceNumber;
	private String customerName;
	private double quality;
	private int productRef;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, String customerName, double quality, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quality = quality;
		this.productRef = productRef;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuality() {
		return quality;
	}
	public void setQuality(double quality) {
		this.quality = quality;
	}
	public int getProductRef() {
		return productRef;
	}
	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", quality=" + quality
				+ ", productRef=" + productRef + "]";
	}
	
	

}

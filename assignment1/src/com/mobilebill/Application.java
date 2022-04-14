package com.mobilebill;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address(11,"Murugan", 636007, "Sipcot");
		
		MobileBill mobilebill = new MobileBill("Ram", 8924734523L, "prepaid", address);
		
//		System.out.println(address.getDoorNumber());
//		System.out.println(address.getAreaName());
//		System.out.println(address.getPinCode());
//		System.out.println(address.getStreetName());
		System.out.println(MobileBill.SERVICE_PROVIDER);
		System.out.println(mobilebill.getCustomerName());
		System.out.println(mobilebill.getMobileNumber());
		System.out.println(mobilebill.getPlanName());
		System.out.println(mobilebill.findAmount());
		
//		System.out.println(mobilebill.toString());
		
		System.out.println(address.toString());
		
	

	}

}

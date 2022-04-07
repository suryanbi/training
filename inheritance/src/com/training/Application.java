package com.training;

import com.training.model.BankAccount;
//import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount ramsAccount = new BankAccount(1050, "Ramesh", 5000, "savings");
		
		System.out.println(ramsAccount);
		
		SavingsAccount account = new SavingsAccount(411, "ramesh", 40000, "joint", "rajesh");
		
		System.out.println(account.getAccountHolderName());
		
		System.out.println(account.getNominee());
		
		SavingsAccountService service = new SavingsAccountService();
		
		System.out.println(service.getCustomerInfo(account));
		
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2 = new SavingsAccountService();
		
		//cannot access the subclass method with superclass reference
		//service2.getCustomerInfor(account);
		
		SavingsAccountService savingService2 = (SavingsAccountService)service2;
		
		
		
		
		
		System.out.println(savingService2.getCustomerInfo(account));
		
		
	}

}

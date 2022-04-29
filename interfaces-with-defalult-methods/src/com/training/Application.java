package com.training;

import com.training.ifaces.Conditional;
import com.training.ifaces.StudentResultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResultService service = new StudentResultService();
		
		System.out.println("Is Pass: "+service.test(90.00));
		
		System.out.println("Is Fail: "+service.negate(90.00));
		
		System.out.println(Conditional.getMessage());

	}

}

package com.training;

import java.util.Optional;


public class UsingOptional {
	
	public static Optional<String> getValue(int key){
		
		Optional<String> response = Optional.empty();
		
		if(key == 1) {
			response = Optional.of("hi");
		}
		return response;
	}
	
	public static Object getString(int key) {
		
		switch (key) {
		case 1:
			return new String ("chocobar");
				
		case 2:
			return new StringBuffer("cassatta");

		default:
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//will throw null pointer exception for values 3 and above
		//System.out.println(getString(3).toString());
		
		//to avoid nullpointer exception and return a default value
		//new feature of java8 optional is used
		
		Optional<Object> optional = Optional.ofNullable(getString(3));
		
		System.out.println(optional.orElse("vannila").toString());
		
		//Here we are checking if the value is present
		//If its present then only we will call get method
		Optional<Object> opt2 = Optional.ofNullable(getString(3));
		
		if(opt2.isPresent()) {
			System.out.println("Value is Present" + opt2.get());
		}else {
			System.out.println("Value is not present");
		}
		
		
		//Using the Lambda Expression with Optional
		Optional<Object> opt3 = Optional.ofNullable(getString(2));
		
		opt3.orElseThrow(() -> new RuntimeException("No Object for value 3 try again"));
		
		//call the getValue Method by passing 1 as argument
		//call the same method again by passing 2 as argument
		//print the result
		
		Optional<String> resp = getValue(1);
		
		if(resp.isPresent()) {
			System.out.println(resp.get().toString());
		}else {
			System.out.println("Invalid choice Enter 1");
		}
		
		//Use the same method but throw Exception
		Optional<String> resp1 = getValue(1);
		
		if(resp1.isPresent()) {
			System.out.println(resp1.get().toString());
		}else {
			resp1.orElseThrow(() -> new RuntimeException("Invalid choice enter 1"));
		}
		
		
		
		
				 
	}

}

package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Method requires three values to be passed [a, b, c]");
//			e.printStackTrace();
		}
	}
	
	public void usingNumberFormatException(String value) {
		
		int age = 0 ;
		try {
			age = Integer.parseInt(value);
			//System.out.println(age);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
		System.err.println("Use a string number value");
		}
		System.out.println(age);
		
	}
	
	public void usingFinallyBlock() {
		int denominator = 4;
		
		try {
			
			System.out.println(4/denominator);
		} catch(ArithmeticException e) {
			System.err.println("Denominator should not be zero");
		}
		finally {
			System.out.println("Inside FINALLY");
		}
		System.out.println("Thanks,bye,bye");
	}
	
	public String underStandFinallyBlock() {
		int denominator = 4;
		
		try {
			
			System.out.println(4/denominator);
		} catch(ArithmeticException e) {
			System.err.println("Denominator should not be zero");
//			return "Welcome";
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			System.out.println("Inside FINALLY");
		}
		System.out.println("bye,bye");
		return "thanks";
	}

}

package com.training.ifaces;

public class StudentResultService implements Conditional<Double>, AgeConditon<Double> {

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		// TODO Auto-generated method stub
		
		//Completely overriding super type with custom type
		if(value>100) {
			return true;
		}else {
			return false;
		}
		
		//calling one of the super type
//		boolean result1 =  Conditional.super.negate(value);
//		//return result1;
//		
		//calling both the super type
//		boolean result2 =  AgeConditon.super.negate(value);
//		
//		if(result1 && result2) {
//			return true;
//		}else {
//			return false;
//		}
	}

	
}

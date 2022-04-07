package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VechicleInsurance;

public class Application {
	
	public static void printPremium(Insurance object) {
		
		System.out.println("Premium:" + object.calculatePremium());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VechicleInsurance car = new VechicleInsurance(1010, "ramesh", "car", 2019);
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(411, "ram", 51);
		
		printPremium(life);
		//System.out.println(life.getPolicyNumber());
		
		String[] illness = {"bp","sugar","thyroid"};
		
		HealthInsurance health = new HealthInsurance(422, "vicky",illness);
		
		printPremium(health);

	}

}

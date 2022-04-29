package com.training;
import java.util.function.*;
import java.util.*;
public class UsingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("India", "SriLanka", "Indonasia", "Bhutan");
		
		Predicate<String> containsChar = (country)->country.startsWith("I");
		
		Consumer<String> consumer = (value)-> {
			if(containsChar.test(value)) {
			System.out.println(value);
		}
		};
	
		names.forEach(consumer);
		
		//names.forEach((value)->System.out.println(value));
	}

}

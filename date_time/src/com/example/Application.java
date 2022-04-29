package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(1, "ram", LocalDate.of(2000, 12 , 12), 
				LocalDateTime.of(2022, Month.MARCH, 01, 9, 30));
		
		Student shyam = new Student(2, "shyam", LocalDate.now(), 
				LocalDateTime.now());
		
		System.out.println("Ram year of birth:"
					+ram.getDateOfBirth().getYear());
		
		System.out.println("Ram first birthday:"
					+ ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		System.out.println("Shyam year of birth:"
					+shyam.getDateOfBirth().getYear());
		
		System.out.println("Shyam sixtyth birthday:"
					+ shyam.getDateOfBirth().plus(60, ChronoUnit.YEARS));
		
		System.out.println("Shyam joining date:"
				+ shyam.getDateOfJoining().getYear());


	}

}

package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateOfBirth = "2000-10-15";
		
		Student vicky = new Student();
		
		vicky.setRollNumber(411);
		vicky.setStudentName("Jerry");
		vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
		vicky.setDateOfJoining(LocalDateTime.now());
		
		//System.out.println("Roll Number:"+ vicky.getRollNumber());
		//System.out.println("Student Name:"+ vicky.getStudentName());
		System.out.println("DateOfBirth:"+ vicky.getDateOfBirth().getYear());
		System.out.println("Month:"+ vicky.getDateOfJoining().getMonth());
		System.out.println("Day:"+ vicky.getDateOfJoining().getDayOfMonth());
		
		LocalTime startTime = LocalTime.of(9, 30);
		
		LocalTime endTime = startTime.plus(8, ChronoUnit.HOURS);
		
		System.out.println("Start Time:"+ startTime);
		
		System.out.println("Ent Time:"+ endTime);
		
		

	}

}

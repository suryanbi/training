package com.training;

import java.util.TreeSet;
import java.util.Set;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(101,"ram", 78);
		Student shyam = new Student(102,"shyam", 68);
		Student mahesh = new Student(103,"charu", 88);
		Student mmahesh = new Student(103,"charu", 88);
		
		Set<Student> set = new TreeSet<>();
		
		set.add(mmahesh);
		set.add(mahesh);
		set.add(shyam);
		set.add(ram);
		
		for (Student eachStudent:set) {
		
		System.out.println(eachStudent.getFirstName());
		}
		
		


	}

}

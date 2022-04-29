package com.training;

import com.training.model.Student;
import java.util.*;
public class HashSetApllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(101,"ram", 78);
		Student shyam = new Student(102,"shyam", 68);
		Student mahesh = new Student(103,"mahesh", 88);
		Student mmahesh = new Student(103,"mahesh", 88);
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(mmahesh);
		set.add(mahesh);
		set.add(shyam);
		set.add(ram);
		
		System.out.println(set);
		
		System.out.println(set.size());


	}

}

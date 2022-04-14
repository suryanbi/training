package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(101,"ram", 78);
		Student shyam = new Student(102,"shyam", 68);
		Student mukesh = new Student(103, "mukesh", 99);
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		System.out.println(map.put(411, ram));
		System.out.println(map.put(412, shyam));
		
		Student added = map.put(412, mukesh);
		
		if(added!=null) {
			map.put(414, added);
		}
		
		System.out.println(map.get(412));
		System.out.println(map.get(414));

	}

}

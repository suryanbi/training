package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(101,"ram", 78);
		Student shyam = new Student(102,"shyam", 68);
		Student mukesh = new Student(103, "mukesh", 99);
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		map.put(411, ram);
		map.put(412, shyam);
		map.put(414, mukesh);
		
		System.out.println(map.get(411));
		System.out.println(map.get(412));
		System.out.println(map.get(414));
		
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			System.out.println(map.get(key));
		}
		
		Collection<Student> list = map.values();
		
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}
		
		//Set<Map.Entry<Integer, Student>> list2 = map.entrySet();
		
		//for(Map.Entry<Integer,Student> eachEntry:list2) {
			
			//System.out.println(eachEntry.getKey());
			//System.out.println(eachEntry.getValue());
		}
		
	}

//}

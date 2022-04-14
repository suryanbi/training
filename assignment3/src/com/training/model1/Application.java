package com.training.model1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Patient;
import com.training.model.Doctor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient ram = new Patient(1, "ram", "siruseri", 7867876787L);
		Patient tom = new Patient(2, "tom", "navalur", 9867876787L);
		Patient ramesh = new Patient(3, "ramesh", "tharamani", 8867876787L);
		
//		Set<Patient> patients = new HashSet<>();
//		
//		patients.add(ramesh);
//		patients.add(tom);
//		patients.add(ram);
		
//		for(Patient eachPatient:patients) {
//			System.out.println(eachPatient);
//		}
		
		Set<Patient> kannaPatList = new HashSet<>();
		
		kannaPatList.add(ramesh);
		kannaPatList.add(tom);
		kannaPatList.add(ram);
		
		Doctor kanna = new Doctor(kannaPatList);
		
		 Map<Doctor,Set<Patient>> map=new HashMap<>();
		 map.put(kanna, kannaPatList);
		 		
		 
		 Appointment app = new Appointment(map);
		 
		 System.out.println(app.getPatients(kanna));
		
		
	}

}

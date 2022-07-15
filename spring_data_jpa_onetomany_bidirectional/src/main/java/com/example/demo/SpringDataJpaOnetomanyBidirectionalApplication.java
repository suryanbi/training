package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.util.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaOnetomanyBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SpringDataJpaOnetomanyBidirectionalApplication.class, args);
		
		Utility obj = ctx.getBean(Utility.class);
		//obj.create();
		
		//obj.findAll();
		
		obj.findDoctorFrmPatient();
		
		ctx.close();
	}
	
	@Bean
	public Doctor sri() {
		Doctor doc = new Doctor();
		doc.setDoctorId(411);
		doc.setDoctorName("Sri");
		doc.setDepartment("General");
		doc.setPhoneNumber(8976565678L);
	
		return doc;
	
	}
	@Bean
	public Patient sakthi() {
		return new Patient(111, "Sakthi", 8976567543L);
		
	}
	@Bean
	public Patient sam() {
		return new Patient(112, "Sam", 8976545679L);
		
	}
	@Bean
	public Patient sonu() {
		return new Patient(113, "Sonu", 8973456754L);
		
	}
	
	@Bean
	public Patient nani() {
		return new Patient(114, "Nani", 8937648737L);
	}
		
	
	

}

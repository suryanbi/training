package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;


@SpringBootApplication
public class SpringDataJpaOnetomanyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SpringDataJpaOnetomanyApplication.class, args);
		
		//DoctorUtils obj = ctx.getBean(DoctorUtils.class);
		
		//obj.create();
		//obj.findAll();
		
		//obj.findAll().forEach(System.out::println);
		
		
		
		ctx.close();
	}
	
	@Bean
	public Doctor sri() {
		
		Doctor doc = new Doctor();
		doc.setDoctorId(411);
		doc.setDoctorName("Sri");
		doc.setDepartment("General");
		doc.setPhoneNumber(8976569843L);
		
		return doc;
	}
	
	@Bean
	public Patient sakthi() {
		
		return new Patient(1, "Sakthi", 9876545762L);
	}
	
	@Bean
	public Patient kavi() {
		
		return new Patient(2, "Kavi", 9876623984L);
	}
	
	@Bean
	public Patient ram() {
	
	return new Patient(3, "Ram", 9876798712L);
}

}

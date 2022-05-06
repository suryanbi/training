package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//Id of the bean as the method name
	@Bean
	public Student ram() {
		
		return new Student(101, "Ramesh", 98);
		
	}
	
	@Bean
	public Teacher sri() {
		
		return new Teacher(202, "Sri", "Computer Science");
		
	}
	
	@Bean
	public Product tv() {
		return new Product(401,"sony tv");
	}
	
	@Bean
	public Customer suresh() {
		return new Customer(501,"Suresh");
	}
	
	@Bean
	public Customer sree() {
		return new Customer (502,"Sree");
	}
	
	@Bean
	public Customer rajesh() {
		return new Customer (503,"Rajesh");
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SingletablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SingletablePerClassHierarchyApplication.class, args);
	
		InsuranceService service = ctx.getBean(InsuranceService.class);
		
		service.addHealthPolicy();
		
		service.getHealthPolicy();
		
		service.addLifePolicy();
		
		service.getLifePolicy();
		
		ctx.close();
	}
	
	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(211, "Ram", 23, "It services");
	}
	
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(321, "Ramesh", 55, "diabetic");
	}
	
	

}

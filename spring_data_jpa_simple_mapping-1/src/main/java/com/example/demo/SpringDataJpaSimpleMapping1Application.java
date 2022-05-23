package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaSimpleMapping1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SpringDataJpaSimpleMapping1Application.class, args);
		
		//Employee sree = ctx.getBean(Employee.class);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		//service.findAll().forEach(System.out::println);
		
		//service.findByDateOfBirth(LocalDate.of(2021, 07, 19)).forEach(System.out::println);
		
		//service.findByLocation("Bangalore").forEach(System.out::println);
		
		//service.findBySkillSet("Java").forEach(System.out::println);
		
		//service.findByempLocorempSkill("Bangalore", "Oracle").forEach(System.out::println);
		
		service.findByLocationAndSkillSet("Chennai", "Oracle").forEach(System.out::println);
		
		
		//Employee added = service.add(sree);
//		
//		if(added!=null) {
//			System.out.println("One Record Added");
//		}
//		ctx.close();
	}
	
	@Bean
	public Employee sree() {
		return new Employee(204, "Sree",LocalDate.of(2021, 07, 19),"Chennai","Oracle",897658);
	}
	
//	@Bean
//	public Employee suresh() {
//		return new Employee(203, "Sakthi",LocalDate.of(2022, 04, 18),"Bangalore","Java",8934765);
//	}

}

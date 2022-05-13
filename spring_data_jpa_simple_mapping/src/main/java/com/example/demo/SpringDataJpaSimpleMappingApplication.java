package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SpringDataJpaSimpleMappingApplication.class, args);
		
		//Doctor sree = ctx.getBean(Doctor.class);
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
		//service.findAll().forEach(System.out::println);
		
		//service.findByDepartment("General").forEach(System.out::println);
		
		//System.out.println(service.findByDoctorName("Sree"));
		
		//service.findByDoctorNameAndDepartment("Siva", "General").forEach(System.out::println);
		
		service.getByNameorDept("Sree", "General").forEach(System.out::println);
		
		//Doctor added = service.add(sree);
		
//		if(added!=null) {
//			System.out.println("One Doctor Added");
//		}
//		
//		ctx.close();
	}
	@Bean
	public Doctor siva() {
		return new Doctor(111, "Siva", "General", 8902837L);
	}
	
	@Bean
	public Doctor sree() {
		return new Doctor(112,"Sree","ENT", 9876567L);
	}

}

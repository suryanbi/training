package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="Driver Service -API", version="1.0"))
public class SpringJpaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRestApiApplication.class, args);
	}
	
	
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			DriverRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Driver(201,"Damu", 89778899, 4.2));
				
			}
		};
		
	}

}

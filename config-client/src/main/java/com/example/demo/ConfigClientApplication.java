package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.ifaces.CreditCardRepository;

@SpringBootApplication
public class ConfigClientApplication {
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ConfigClientApplication.class, args);
		
		CreditCardRepository repo = ctx.getBean(CreditCardRepository.class);
		
		repo.findAll().forEach(System.out::println);
	}

}

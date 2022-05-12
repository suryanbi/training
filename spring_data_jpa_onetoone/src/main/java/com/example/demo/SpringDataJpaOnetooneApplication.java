package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOnetooneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run
				(SpringDataJpaOnetooneApplication.class, args);
		
		SeminarUtils obj = ctx.getBean(SeminarUtils.class);
		
		obj.create();
		obj.findAll();
		ctx.close();
	}
	
	
	
	@Bean
	public Seminar java() {
		Seminar sem=new Seminar();
		sem.setId(101);
		sem.setDuration(10);
		sem.setName("java");
		return sem;
		
	}

	@Bean
	public Speaker sri() {
		return new Speaker(1, "Sri", "B.E.");
	}
}

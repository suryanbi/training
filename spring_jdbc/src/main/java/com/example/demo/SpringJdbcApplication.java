package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		//System.out.println(repo.findById(116));
		
		//System.out.println(repo.remove(116));
		
		Product pillow = ctx.getBean(Product.class);
		
		System.out.println(repo.update(pillow));
		
		//Product glass = ctx.getBean(Product.class);
		
		//System.out.println("RowAdded:" +repo.add(glass));
		
		repo.findAll().forEach(System.out::println);
		
		
	}
	
//	@Bean
//	public Product watch() {
//		return new Product(103,"watch",1230);
//	}
	@Bean
	public Product pillow() {
		return new Product(801, "Pillow", 500);
	}

}

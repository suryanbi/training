package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;

@ComponentScan(basePackages = {"org.training","com.example"})
@SpringBootApplication
public class SpringQuickStartApplication {
	

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringQuickStartApplication.class, args);
		

		/*
		//When using Id Need to cast to specific Bean since
		//return type of getBean Method is Object 
		Student ram = (Student) ctx.getBean("ram");
		System.out.println(ram);
		
		//casting not required, but there should be only one bean of that type
		//will throw Exception
		//Student shyam = ctx.getBean(Student.class);
		//System.out.println(shyam);
		
		//When More than One Bean of the same Type available
		//should use id and calss name
		Teacher stella = ctx.getBean("stella", Teacher.class);
		stella.setId(201);
		stella.setName("Sree");
		stella.setSubject("DPSD");
		System.out.println(stella);
		
		Teacher sri = (Teacher) ctx.getBean("sri");
		System.out.println(sri);
		*/
		
		System.out.println(ctx.getBean(Book.class));
		
		System.out.println("Author:"+ ctx.getBean(Author.class));
		
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
		System.out.println("Customer:"+ bill.getCustomer());
		System.out.println("Product:"+ bill.getProduct());
		
		CustomerList list = ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
	}
	
	@Bean
	public Author harish() {
		return new Author(801, "Harish");
		}
	
	@Bean
	@Primary
	public Author mani() {
		return new Author(802, "Mani");
		}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;

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
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
		System.out.println("Customer:"+ bill.getCustomer());
		System.out.println("Product:"+ bill.getProduct());
		
		CustomerList list = ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
	}

}

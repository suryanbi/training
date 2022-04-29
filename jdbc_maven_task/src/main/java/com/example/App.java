package com.example;

import java.sql.Connection;

import com.example.dao.LoanApplicationRepository;
import com.example.util.ConnectionFactory;

public class App 
{
    public static void main( String[] args )
    {
        Connection con;
        
        try {
        	con = ConnectionFactory.getOracleConnection();
        	//System.out.println(con);
        	
        	
        	//findAll
        	LoanApplicationRepository repository = new LoanApplicationRepository(con);
//        	repository.findAll().forEach(System.out::println);
        	
        	//insertValue
        	//Customer service1 = new Customer(4, "JERRY", 8982143567L, 700);
        	//LoanApplication loan = new LoanApplication(104, service1 , 8000);
        	
        	//int rowAdded = repository.add(loan);
        	
        	//System.out.println("Row Added:" + rowAdded);
        	
        
        	
        	//repository.findAll().forEach(System.out::println);
        	
        	
        	//int rowDeleted = repository.remove(id);
        	//System.out.println("Row Deleted:"+ rowDeleted);
        	
        	repository.findAll().forEach(System.out::println);
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

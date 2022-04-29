package com.example;

import java.sql.*;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.entity.Member;
import com.example.util.ConnectionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
		try {
			//con= DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			//System.out.println(con);
			
			con = ConnectionFactory.getOracleConnection();
			
			//System.out.println(con);
			
			
			MemberRepository repository = new MemberRepository(con);
			//repository.findAll().forEach(System.out::println);
			
			//Member toAdd = new Member(6, "tom", "delhi", LocalDate.of(04,04,04),"ANNUAL", 10000, 1, 100);
			
			//System.out.println("Row Added:" +toAdd);

			//repository.findAll().forEach(System.out::println);
			
			int rowDeleted = repository.remove(6);
			System.out.println("Row Deleted:" +rowDeleted);
			
			repository.findAll().forEach(System.out::println);
			

		}catch(Exception e) {
    	e.printStackTrace();
    	}
    }
}

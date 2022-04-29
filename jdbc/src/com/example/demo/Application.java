package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			ProductService service = new ProductService(con);
			
			//Product toAdd = new Product(151,"UPS", 34000.00);
			
			//int rowAdded = service.addProduct(toAdd);
			
			//System.out.println("Row Added:" +rowAdded);
			
			//int rowDeleted = service.deleteByInt(151);
			
			//System.out.println("Row Deleted:" + rowDeleted);
			
//			Optional<Product> found = service.findById(111);
//			
//			if(found.isPresent()) {
//			System.out.println(found.get());
//			}
//			else {
//				System.out.println("ID not present");
//			}
//			
//			int rowsUpdated = service.updatePriceByName("PHONE", 20000);
//			System.out.println("Rows Updated:"+ rowsUpdated);
			
			//price of prd1 is low to prd2. So, value cannot insert 
			//Product kathli = new Product(1003, "badam kathli", 450.00);
			
//			Product cream = new Product (602, "ice cream", 300.00);
//			
//			service.usingTxn(kathli, cream);
			
			Invoice inv = new Invoice(702, "com", 400, 121);
			
			Product prd = new Product(901, "Pillow", 450);
			
			service.usingTxnWithCatchBlock(prd, inv);
			
			
			
			
			//service.findAll().forEach(System.out::println);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

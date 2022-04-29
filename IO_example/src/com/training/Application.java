package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java = new Book(1, "First Java", "Jerry", 500);
		
		BookService service = new BookService();
		
//	boolean result = service.writeToFile(new File("Books.txt"), java);
//		
//		
//	if(result) {
//		System.out.println("One Record Added to File");
//		}
		
		
		service.readFromFile(new File("Books.txt"))
				.forEach(System.out::println);
	}

}

package com.training;

import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class Application {
	
public static void print(List<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java = new Book(411, "java", "sam", 450);
		Book spring = new Book(412, "spring", "ram", 550);
		Book maven = new Book(413, "maven", "dam", 650);
		Book html = new Book(414, "html", "jam", 750);
		Book python = new Book(415, "python", "cam", 850);
		
		CrudRepository service = new BookService();
		
		System.out.println(service.add(java));
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		//print(service.findAll());
		
		List<Book> bookList = service.findAll();
		
		for (Book eachBook:bookList) {
			System.out.println(eachBook);
		}
		
		Book foundBook = service.findById(411);
		System.out.println(foundBook);
		
		service.remove(python);
		
		print(service.findAll());
		
//		List<Book> secondBookList = service.findAll();
//		
//		for (Book eachBook:secondBookList) {
//			System.out.println(eachBook);
//		}
		
		Book react = new Book(415, "reactjs", "ramesh", 6850);
		
		service.add(react);
		
		print(service.findAll());
		
		Book reactNew = new Book(415, "reactjs", "rameshkanna", 7850);
		
		service.update(react,reactNew);
		
		System.out.println("After Update");
		
		print(service.findAll());

	}
	


}

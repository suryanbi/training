package com.training;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Zahir");
		names.add("Paven");
		
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println(names);
		
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
		
		List<Book> bookList = service.findAll();
		
		Collections.sort(bookList);
		System.out.println("Sort By Book Number");
		System.out.println(bookList);
		
		Collections.sort(bookList, new BookNameComparator());
		System.out.println("Sort By Book Name");
		
		print(bookList);

	}

public static void print(List<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		
	}

}

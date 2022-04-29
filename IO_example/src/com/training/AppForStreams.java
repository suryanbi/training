package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class AppForStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service = new BookService();
		File file = new File("Book.ser");
		
		int ch = 2;
		if(ch==1) {
		
		Book book = new Book(11,"Oracle","Ram",670);
		
		boolean result = service.writeToStream(file, book);
		
		if(result) {
			System.out.println("One Record Serialized");
		}
		}
		else {
			Book fromFile =
					(Book) service.readFromStream(file);
			
			System.out.println(fromFile);
		}

	}

}

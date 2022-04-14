package com.training.services;

import java.util.List;
import java.util.ArrayList;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	private ArrayList<Book> bookList;
	

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList = new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		
		for(Book value : bookList) {
			if(value.getBookNumber()== id) {
				return value;
			}
		}
		
		return null;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook, Book newBook) {
		// TODO Auto-generated method stub
		
		if(this.bookList.contains(oldBook)) {
			
			int idxPos = this.bookList.indexOf(oldBook);
			
			this.bookList.set(idxPos, newBook);
			
		} 
		return newBook;
	}

}

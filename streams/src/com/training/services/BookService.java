package com.training.services;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
	
	
	public List<Book> findBooksGrtThan(double price){
		
		return this.bookList.stream().filter(e -> e.getPrice()>price)
					.collect(Collectors.toList());
	}
	
	public List<String> getBookNames(){
		return this.bookList.stream()
				.map(e -> e.getBookName())
				.collect(toList());
	}
	
	public List<Book> sortedByName(){
		return this.bookList
				.stream()
				.sorted(Comparator.comparing(Book::getBookName))
				.collect(toList());
	}
	
	public List<Book> sortedByNumberDesc(){
		return this.bookList
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(toList());
	}
	
	public List<String> getBookNameGrtThanPrice(double price){
		return this.bookList.stream()
				.filter(e -> e.getPrice()>price)
				.map(e -> e.getBookName())
				.collect(toList());
	}

}

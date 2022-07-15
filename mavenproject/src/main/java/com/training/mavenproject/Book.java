package com.training.mavenproject;

public class Book {
	
	private String bookName;
	private int bookNumber;
	public Book() {
		super();
	}
	public Book(String bookName, int bookNumber) {
		super();
		this.bookName = bookName;
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookNumber=" + bookNumber + "]";
	}

}

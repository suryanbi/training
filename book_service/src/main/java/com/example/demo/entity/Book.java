package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="suryabook101")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
	
	@Id
	@Column(name="book_no")
	int bookNumber;
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="author")
	String author;
	
	@Column(name="cost")
	double cost;
	
	@Column(name="category")
	String category;

}

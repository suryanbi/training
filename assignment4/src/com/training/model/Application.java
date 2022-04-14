package com.training.model;

import java.util.TreeSet;

import com.training.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Product>product=new TreeSet<>();
		
		Product bag = new Product(1, "bag", 100);
		Product shirt = new Product(1, "shirt", 200);
		Product note = new Product(1, "note", 150);
		Product book = new Product(1, "book", 50);
		Product pen = new Product(1, "pen", 10);
		
		product.add(bag);
		product.add(shirt);
		product.add(note);
		product.add(book);
		product.add(pen);
		
		ProductService service = new ProductService(product);
		System.out.println(service.getTopThree());
		
		
		
		

	}

}

package org.training.model;

import org.springframework.stereotype.Service;

@Service
public class Book {
	
	public double getDiscount(String bookName) {
		
		return 0.11;
		
	}

}

package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
	
	public double getInterestRate(int value) {
		System.out.println("Value in Service:"+ value);
		return 4.5;
	}

}

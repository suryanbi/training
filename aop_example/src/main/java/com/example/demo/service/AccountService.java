package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service

public class AccountService {
	
	Logger log = Logger.getAnonymousLogger();
	
	public List<String> getAccount(){
		
		//log.info("Get Account Details");
			
		return Arrays.asList("Ramesh","Suresh","Mahesh");
	}

}

package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.model.Book;

public class LoggingWithPropSaveFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger(LogToFile.class.getName());
		
		
		FileHandler handler;
		
		try {
			 handler = new FileHandler("logs2.log");
			 
			 log.addHandler(handler);
			 
			 Book.log.info("Logging Properties Done Right");
				
				Book java = new Book();
				
				Book.log.info(java.toString());
			 
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}

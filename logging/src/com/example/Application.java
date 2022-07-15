package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.ALL);
		
		log.fine("I am Fine Message");
		log.info("Info Message");
		
		log.warning("Warning Message");
		log.severe("Severe Message");
	
		

	}

}

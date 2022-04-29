package com.example;
import java.io.IOException;
import java.util.logging.*;



public class LogToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			
			log.info("Try Block Called");
			
			throw new Exception("K is a great programmer");
			
		} catch (SecurityException e) {
			
			log.warning(e.getMessage());
		} catch (IOException e) {
			
			log.warning(e.getMessage());
		}
		catch (Exception e) {
			
			log.warning(e.getMessage());
		}
		
	

	}

}

package com.training.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Application {

	public static void main(String[] args) {
		
				File fruitFile = new File("Fruit.txt");
			    File File1 = new File("File.txt");
			  
			try {
			      
			      FileWriter myWriter = new FileWriter("Fruit.txt");
			      myWriter.write("Apple is red in colour"
			      		+ "\nOrange is round in shape"
			      		+ "\nBanana is good for health"
			      		+ "\nGrapes will grow as bunch"
			      		+ "\nMango is seasonal fruit");
			      myWriter.close();
			      
			      FileWriter myWriter1 = new FileWriter("File.txt");
			      myWriter1.write("Description");
			      myWriter1.close();
			      
			      System.out.println("Files Created");
			      
			      PrintWriter print = new PrintWriter("File.txt");
			          
			      BufferedReader buffer = new BufferedReader(new FileReader("Fruit.txt"));
			          
			      String line = buffer.readLine();
			          
			      while (line != null){
			            print.println(line);
			            line = buffer.readLine();
			      }
			      print.flush();
			      buffer.close();
			      print.close();
			        
			      if (fruitFile.delete()) {
			            System.out.println("File deleted");
			        }
			        else {
			            System.out.println("File Not Deleted");
			        }
			      
			    } catch (IOException e) {
			    	System.out.println("Error");
			    }

			  }
			
			
	}



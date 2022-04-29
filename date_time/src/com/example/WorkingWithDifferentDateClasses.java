package com.example;

import java.util.*;
import java.sql.*;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating UTIL date
		java.util.Date date1 = new java.util.Date();
		//java.sql.Date date2 = new java.sql.Date(41115);
		
		System.out.println(date1);
		System.out.println(date1.getTime());
		
		//UTIL date to SQL date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date2);
		
		//SQL to LOCAL date
		LocalDate localDate = date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		//LOCAL date to SQL date
		java.sql.Date sqlDate2 = 
				 java.sql.Date.valueOf(localDate);
		
		System.out.println("SQL date2:"+ sqlDate2);
	}

}

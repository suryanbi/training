package com.example.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
	
	public static Connection getOracleConnection(){
		
		Connection con = null;
		
		ResourceBundle labels = ResourceBundle.getBundle("application");
		
		try {
			con = DriverManager.getConnection(labels.getString("datasource.oracle.url"),
					labels.getString("datasource.oracle.username"),
					labels.getString("datasource.oracle.password"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return con;
		
		
	}

}

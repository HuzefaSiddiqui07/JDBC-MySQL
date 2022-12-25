package com.mysql.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	Connection con = null;
	
	// Create a Connection Return Type Method
	public Connection getConnectionDetails() {
		
		try {
			
			// Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish the connection
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}

}

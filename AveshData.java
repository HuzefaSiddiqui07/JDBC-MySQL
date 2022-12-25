/*
  Steps-
Step 1: Load the Driver class
Step 2: Establish the connection
Step 3: Create the statement
Step 4: Prepare the SQL statement
Step 5: Submit the SQL statement to Database
Step 6: Process the Results
Step 7: Release the Resources

 */

// Example-1 Program for insert the student data using statement through JDBC.

package com.database.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AveshData {

	public static void main(String[] args) {
		
		try {
			
			// Load the Driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			
			// Create the statement
			Statement stmnt = con.createStatement();
			
			
			// Prepare the SQL statement
			String str = ("insert into avesh(firstname , lastname , address)values('Avesh','Shaikh','Kalyan')");
			
			// Submit the SQL statement to Database
			stmnt.execute(str);
			
			// Process the Results
			System.out.println("Insertion Done");
			
			// Release the Resources
			con.close();
			stmnt.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}

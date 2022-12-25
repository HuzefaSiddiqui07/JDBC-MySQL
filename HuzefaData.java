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

// Example-2 Program for insert the student data using prepared statement.

package com.database.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class HuzefaData {

	public static void main(String[] args) {
		
		try {
			
			// Load the Driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establish the connection
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
 
                  //Create the statement
			PreparedStatement pStmnt = con.prepareStatement("insert into huzefa(firstname , lastname)values(? , ?)");
			
			pStmnt.setString(1, "Huzefa");
			pStmnt.setString(2, "Siddiqui");
			
			// Submit the SQL statement to Database
			int a = pStmnt.executeUpdate();
			
			// Process the Results
			System.out.println("Record Insert"+a);
			
			// Release the Resources
			con.close();
			pStmnt.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		

	}

}

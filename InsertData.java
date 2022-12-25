/*
  Steps :
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

public class InsertData {

	public static void main(String[] args) {
		
		// for(int a = 1; a <=5; a++) {
			
			// Use Try & Catch
			try {
				
			// Load the Driver Class
		   Class.forName("com.mysql.jdbc.Driver");
		   
		   // Establish the connection
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		   
		   // Create the statement
		   Statement stmnt = con.createStatement();
		   
		  // Prepare the SQL Statement
		   String sql = "insert into employee(firstname , lastname , address , salary) values ('Avseh','Shaikh','Mumbai',5000)";
		   
		  // Submit the SQL statement to Database
		   stmnt.execute(sql);  // stmnt.executeUpdate(sql);
		   
		   // Process the Results
		   System.out.println("Insertion Sucessfully !!!");
		   
		   // Release Or Close the Resources
		   con.close();
		   stmnt.close();
				
		    } catch(Exception e) {
				
				System.out.println(e);
				
			}
			
		//}
		
		
	}

}

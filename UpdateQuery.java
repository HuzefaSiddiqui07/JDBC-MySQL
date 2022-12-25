package com.database.mysql.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// Load the Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		
		// Create the statement
	 PreparedStatement pStmnt = con.prepareStatement("update employee set firstname=?, lastname=? where id=?");
	 pStmnt.setString(1, "Ram");
	 pStmnt.setString(2, "Patil");
	 pStmnt.setInt(3, 5);
	 
	 PreparedStatement pStmnt1 = con.prepareStatement("update employee set firstname=?, lastname=? where id=?");
	 pStmnt1.setString(1, "Shyam");
	 pStmnt1.setString(2, "Patel");
	 pStmnt1.setInt(3, 6);
	// Submit the SQL statement to Database
	 int a = pStmnt.executeUpdate();
	 int b = pStmnt1.executeUpdate();
	// Process the Results
	 System.out.println("Updated Record" + a);
	 System.out.println("Updated Record" + b);
	// Release Or Close the Resources
	 con.close();
	 pStmnt.close();
	 pStmnt1.close();

	}

}

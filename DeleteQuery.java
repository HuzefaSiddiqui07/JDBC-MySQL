package com.database.mysql.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load the Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		
		// Create the statement
		PreparedStatement pStmnt = con.prepareStatement("delete from employee where id=?");
		pStmnt.setInt(1, 10);
		
		// Submit the SQL statement to Database
		int i = pStmnt.executeUpdate();
		
		// Process the Results
		System.out.println("Delete Record" + i);
		
		// Release Or Close the Resources
		con.close();
		pStmnt.close();

	}

}

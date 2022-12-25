package com.database.mysql.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load the Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		
		// Create the statement
		PreparedStatement pStmnt = con.prepareStatement("select * from employee");
		
		// Submit the SQL statement to Database
		ResultSet rs = pStmnt.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id >>> " + rs.getInt(1));
			System.out.println("First Name >>> " + rs.getString(2));
			System.out.println("Last Name >>> " + rs.getString(3));
			System.out.println("Address >>> " + rs.getString(4));
			System.out.println("Salary >>> " + rs.getInt(5));
		}
		
		// Release Or Close the Resources
		con.close();
		pStmnt.close();
	}

}

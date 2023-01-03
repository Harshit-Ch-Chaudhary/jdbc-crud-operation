package com.qsp.statements.statics.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class EmployConnection {
public static Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/jdbc-statements-statics";
			String user = "root";
			String pass = "hcpv11";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pass);
			
			return connection;
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}	
	


package com.java.jdbc;

import java.sql.*;

public class createconnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "SYSTEM");
		
			String q="create table table1( id int(10) ,name varchar(20), city varchar(10))";
			Statement stmt =con.createStatement();
		    stmt.executeUpdate(q);
		    System.out.println("table is createed");
		   con.close();
	
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

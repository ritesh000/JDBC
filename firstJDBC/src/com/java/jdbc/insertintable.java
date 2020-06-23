package com.java.jdbc;

import java.sql.*;

public class insertintable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "SYSTEM");

			
			
			String q="insert into table1(id,name ,city) value(?,?,?)";
			PreparedStatement ps=con.prepareStatement(q);
			
			ps.setInt(1,101);
			ps.setString(2,"ritesh");
            ps.setString(3,"kota");
            ps.executeUpdate();
           System.out.println("inserted ");
            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

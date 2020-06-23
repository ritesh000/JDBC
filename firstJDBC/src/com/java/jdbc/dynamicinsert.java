package com.java.jdbc;

import java.sql.*;
import java.util.Scanner;

public class dynamicinsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "SYSTEM");
			Scanner sc = new Scanner(System.in);
			int i = 0;
			System.out.println("enter the number of row insert");
			int n = sc.nextInt();
			for (i = 0; i < n; i++) {
				String q = "insert into table1(id,name ,city) value(?,?,?)";
				PreparedStatement ps = con.prepareStatement(q);

				System.out.println("enter the id: ");
				int id = sc.nextInt();
				System.out.println("enter the name :");
				String name = sc.next();
				System.out.println("enter the city name :");
				String city = sc.next();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, city);
				ps.executeUpdate();
				System.out.println("successfully inserted");
				
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

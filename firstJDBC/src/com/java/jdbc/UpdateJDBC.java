package com.java.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class UpdateJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "SYSTEM");
			// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);

			String q = "update table1 set name=? ,city=?  where id=?";

			PreparedStatement ps = con.prepareStatement(q);

			System.out.println("enter the name :");
			// String name = br.readLine();
			String name = sc.next();
			System.out.println("enter the city name :");
			// String city = br.readLine();
			String city = sc.next();
			System.out.println("enter the id: ");
			// int id = Integer.parseInt(br.readLine());
			int id = sc.nextInt();
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setInt(3, id);
			ps.executeUpdate();
			System.out.println("successfully update");
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

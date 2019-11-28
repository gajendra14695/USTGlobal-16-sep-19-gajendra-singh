package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class MyFirstInsertQuery {

	

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader=null;
		PreparedStatement pstmt=null;
		Scanner sc= new Scanner(System.in);
		
		
			reader = new FileReader("db.properties");
			Properties prop= new Properties();
			prop.load(reader);
			
		Class.forName(prop.getProperty("driver-class-name"));
			
			
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop.getProperty("user"),prop.getProperty("pass"));//method overloading 
	
			
		
			stmt=conn.createStatement();
			String sql =prop.getProperty("insert-query");
		//int	rn = stmt.executeUpdate(sql);
			System.out.println("Enter id : ");
			int id = sc.nextInt();

		
			//int id = Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
		
		
		pstmt=conn.prepareStatement(sql);

		
		int sal = Integer.parseInt(args[0]);
		

		String name= args[1];
		
		String emp_sal= args[2];
		int empl_sal = Integer.parseInt(emp_sal);
		
		String gender= args[3];
		
		pstmt.setInt(4, sal);
		pstmt.setString(1, name);
		
		pstmt.setString(3, gender);
		pstmt.setInt(2, empl_sal);
		
		

		int count = pstmt.executeUpdate();
		System.out.println(count);
}}

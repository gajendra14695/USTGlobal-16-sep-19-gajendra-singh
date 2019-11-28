package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCDelete {
public static void main(String[] args) throws Exception {
	

	Connection conn= null;
	Statement stmt = null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	FileReader reader=null;
	try {



reader = new FileReader("db.properties");
Properties prop= new Properties();
prop.load(reader);

Class.forName(prop.getProperty("driver-class-name"));


String url =prop.getProperty("url");
conn = DriverManager.getConnection(url,prop.getProperty("user"),prop.getProperty("pass"));//method overloading 



stmt=conn.createStatement();
String sql =prop.getProperty("delete-query");
		
		
		pstmt=conn.prepareStatement(sql);

	
		//int id = Integer.parseInt(args[0]);
		pstmt.setInt(1, Integer.parseInt(args[0]));

		//stmt=conn.createStatement();
		int count = pstmt.executeUpdate();
		System.out.println(count);
//		
//		String sql1 ="select * from employee_info ";
//		rs = stmt.executeQuery(sql1);
//		while(rs.next()) {
//			
//			int id = rs.getInt("id");
//			String name =rs.getString("name");
//			int sal =rs.getInt("sal");
//			String gender = rs.getString("gender");
//			
//			System.out.println("Id      :"+id);
//			System.out.println("name    :"+name);
//			System.out.println("salary  :"+sal);
//			System.out.println("gender  :"+gender);
//			System.out.println("******************************");
//			}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
			conn.close();	
			}if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}

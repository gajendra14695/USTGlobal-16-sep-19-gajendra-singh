package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteDeleteQuery {
public static void main(String[] args) throws Exception {
	
	Connection conn= null;
	Statement stmt = null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	Scanner sc = new Scanner(System.in);
	
	try {

Class.forName("com.mysql.jdbc.Driver");
		
		String url="Jdbc:mysql://localhost:3306/ust_ty_db?";
		conn=DriverManager.getConnection(url, "root","root");
		String sql= "delete from employee_info where id =?";
		
		pstmt=conn.prepareStatement(sql);
		System.out.println("Enter id : ");
		int id = sc.nextInt();

	
		//int id = Integer.parseInt(args[0]);
		pstmt.setInt(1, id);

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

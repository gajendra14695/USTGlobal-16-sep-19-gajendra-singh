package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ExecuteUpdateScanner {
public static void main(String[] args) throws Exception {
	
	Scanner sc= new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt = null;
	Class.forName("com.mysql.jdbc.Driver");
	String url= "Jdbc:mysql://localhost:3306/ust_ty_db?";

	conn =DriverManager.getConnection(url, "root", "root");
	
	String sql = "update employee_info set name='gajendra' ,sal=560000 ,gender='m  where  id=?";
	pstmt=conn.prepareStatement(sql);
	
	int k=sc.nextInt();
	
	pstmt.setInt(1, k);
	int count= pstmt.executeUpdate();
	System.out.println(count+" Row delete");

	
}
}

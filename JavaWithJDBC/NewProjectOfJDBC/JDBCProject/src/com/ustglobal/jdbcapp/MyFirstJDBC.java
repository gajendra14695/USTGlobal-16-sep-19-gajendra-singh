package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;
//import java.sql.Statement;
public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step 1 loaded Drive
			//four type of Driver  we have.....................
			//1>ODBC JDBC bridge.
			//2>NativeAPI 
			//3>Network
			
			//4>Native Protocol
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			//step 2  Get the Connection
			
			String url ="Jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");//method overloading 
	
			
			//step 3 Issue SQL query
			stmt=conn.createStatement();// object type Statement ,
			//Statement is a Interface , so we can,t create the Object.
			//so we goto the different method . Method is createrStatement();
			//method is abstract , public
			//return type is Statement;
			String sql ="select * from employee_info ";
			rs = stmt.executeQuery(sql);// we can,t create the Object of ResultSet
			//what is resultSet?
			
			//Step 4 Read the Result
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name =rs.getString("name");
				int sal =rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id      :"+id);
				System.out.println("name    :"+name);
				System.out.println("salary  :"+sal);
				System.out.println("gender  :"+gender);
				System.out.println("******************************");
				}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

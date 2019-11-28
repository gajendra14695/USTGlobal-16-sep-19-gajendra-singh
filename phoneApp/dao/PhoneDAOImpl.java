package com.ustglobal.phoneApp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.ustglobal.phoneApp.dto.PhoneBean;

public class PhoneDAOImpl implements PhoneDAO{

	@Override
	public List<PhoneBean> getAllContact() {
		String url = "jdbc:mysql://localhost:3306/contact_file?user=root&password=root";
		String sql = "select * from contact";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			ArrayList<PhoneBean> result = new ArrayList<>();
			
			while(rs.next()) {
				PhoneBean bean = new PhoneBean();
				

				String name = rs.getString("name");
				bean.setName(name);
				
				int number = rs.getInt("number");
				bean.setNumber(number);
				
				String groups = rs.getString("groups");
				bean.setGroups(groups);
				
				result.add(bean);
				
				
			}
			return result;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		
	}

	@Override
	public PhoneBean searchContact(String name) {

		String url = "jdbc:mysql://localhost:3306/contact_file?user=root&password=root";
		String sql = "select * from contact where name=?";
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				PhoneBean bean = new PhoneBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				return bean;
				
			}else {
				return null;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int addContact(PhoneBean addInfo) {
		String url = "jdbc:mysql://localhost:3306/contact_file?user=root&password=root";
		String sql = "insert into contact values(?,?,?)";
		
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, addInfo.getName());
			pstmt.setInt(2, addInfo.getNumber());
			pstmt.setString(3, addInfo.getGroups());
			int count = pstmt.executeUpdate();
			return count;
			
			
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		
		
	}

	@Override
	public int deleteContact(String name2) {
		String url = "jdbc:mysql://localhost:3306/contact_file?user=root&password=root";
		String sql = "delete from contact where name=?";
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name2);
			int count = pstmt.executeUpdate();
			return count;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int editContact(PhoneBean editInfo, String name) {
		String url ="jdbc:mysql://localhost:3306/contact_file?user=root&password=root";
		String sql = "update contact set number=?,groups=? where name=?";
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, editInfo.getNumber());
			pstmt.setString(2, editInfo.getGroups());
			pstmt.setString(3, name);
			
			int count = pstmt.executeUpdate();
			return count;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	

}

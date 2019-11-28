package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesFileReader {
 public static void main(String[] args) {
	String path="db.properties";
	FileReader reader= null;
	Connection conn=null;
	Statement stmt= null;
	try {
		
		reader =new FileReader("db.properties");
		Properties properties = new Properties();
		properties.load(reader);
		Class.forName("driver-class-name");
		
		//String name = properties.getProperty("name");
		//String Company = properties.getProperty("Company");
		String url = properties.getProperty("url");
		
		String user = properties.getProperty("user");
		String pass = properties.getProperty("pass");
		conn =DriverManager.getConnection(url, user, pass);
		//System.out.println("Name    :"+name);
		//System.out.println("Company :"+Company);
	stmt=conn.createStatement();
		System.out.println("Name    :"+url);
		System.out.println("Name    :"+user);
		System.out.println("Name    :"+pass);
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

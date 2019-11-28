package com.ustglobal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;
import com.ustglobal.employeedao.IEmployeeDAO;
import com.ustglobal.employeedao.EmployeeDAOImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all meployee data");
		System.out.println("Press 2 to insert meployee data");
		System.out.println("Press 3 to update meployee data");
		System.out.println("Press 4 to delete meployee data");
		System.out.println("Press 5 to search single meployee data");
		
		Scanner sc  = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i) {
		case 1:
			IEmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getEmployee();
			for(EmployeeBean bean : result) {
				System.out.println("Name: "+bean.getId());
				System.out.println("Id: "+bean.getName());
				System.out.println("Salary: "+bean.getSal());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("********************");
			}
			break;
		case 2:
			IEmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean1 =  new EmployeeBean();
			
			bean1.setId(sc.nextInt());
			bean1.setName(sc.next());
			bean1.setSal(sc.nextInt());
			bean1.setGender(sc.next());
			
			int count = dao2.insertEmployeeData(bean1);
			System.out.println(count+" "+" row inserted");
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			IEmployeeDAO dao1 = EmployeeManager.getEmployeeDAO();
			int id = sc.nextInt();
			EmployeeBean bean = dao1.searchEmployee(id);
			System.out.println("********************");
			if(bean != null) {
				System.out.println("Name: "+bean.getId());
				System.out.println("Id: "+bean.getName());
				System.out.println("Salary: "+bean.getSal());
				System.out.println("Gender: "+bean.getGender());
			}
			else
				System.out.println("no data found");
			break;
		
		}
	}
}

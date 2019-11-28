package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.println("press 1 to get all employee data ");
		System.out.println("press 2 to insert employee data ");
		System.out.println("press 3 to update employee data ");
		System.out.println("press 4 to delete employee data ");
		System.out.println("press 5 to search employee data ");
		
		int ch = scn.nextInt();
		
		switch(ch) {
		case 1 : 
		EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		List<EmployeeBean> result=dao.getAllEmployeeData();
		
		for(EmployeeBean bean :result) {
			
			System.out.println("name is   :"+bean.getName());
			
			System.out.println("Id is     :"+bean.getId());
			
			System.out.println("gender is :"+bean.getGender());
			
			System.out.println("sal is    :"+bean.getSal());
			System.out.println("*****************************");
			
		}
		break;
		
		case 2 : //EmployeeDAOImpl impl2 = new EmployeeDAOImpl();
//		int emp_id=scn.nextInt();
//		String name= scn.nextLine();
//		int salary= scn.nextInt();
//		String gender= scn.nextLine();
		
		//EmployeeBean bean2=impl2.insertEmployeeData(emp_id,name,salary,gender);
		
			break;
		
		case 3:
			break;
		case 4:
			break;
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id=scn.nextInt();
			EmployeeBean bean=dao5.searchEmployeeData(id);
			if(bean!=null) {
				
				System.out.println("name is   :"+bean.getName());
				
				System.out.println("Id is     :"+bean.getId());
				
				System.out.println("gender is :"+bean.getGender());
				
				System.out.println("sal is    :"+bean.getSal());
				System.out.println("*****************************");
				
			}else {
				System.out.println(" NO Data Found ");
			}
			break;
		default :
		}//end switch 
		
		
	}//end main()

}//end class


package com.ustglobal.phoneApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.ustglobal.phoneApp.dao.PhoneDAO;
import com.ustglobal.phoneApp.dto.PhoneBean;
import com.ustglobal.phoneApp.util.PhoneManagerFactory;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("press 1 to show all contacts");
		System.out.println("press 2 to search for contact");
		System.out.println("press 3 to operate all operation");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			PhoneDAO dao1 = PhoneManagerFactory.getPhoneDAO();
			List<PhoneBean> result =  dao1.getAllContact();
			
			for ( PhoneBean bean : result) {

				System.out.println("Name is "+bean.getName());
				System.out.println("Number is "+bean.getNumber());
				System.out.println("Group is "+bean.getGroups());
				System.out.println("==================");
			}

			break;
			
		case 2:
			PhoneDAO dao2 = PhoneManagerFactory.getPhoneDAO();
			System.out.println("Enter name to fetch the data");
			String name = sc.next();
			PhoneBean bean1 = dao2.searchContact( name);
			if(bean1!=null) {
				System.out.println("Name is "+bean1.getName());
				System.out.println("Number is "+bean1.getNumber());
				System.out.println("Group is "+bean1.getGroups());
				System.out.println("press 1 to call");
				System.out.println("press 2 to message");
				System.out.println("press 3 to call");
				
				int  a = sc.nextInt();
				switch(a) {
				case 1:
					System.out.println("make a call");
					break;
				case 2:
					System.out.println("write a message");
					break;
				case 3:
					break;
				}
			}
			
			else {
				System.out.println("No data found");
			}
			break;
		case 3:
			System.out.println("press 1 to add contact");
			System.out.println("press 2 to delete contact");
			System.out.println("press 1 to edit contact");
			int b = sc.nextInt();
			switch(b) {
			case 1:
				PhoneDAO addDao = PhoneManagerFactory.getPhoneDAO();
				PhoneBean addInfo = new PhoneBean();
				System.out.println("Enter name");
				String name1 = sc.next();
				System.out.println("Enter mobile number");
				int mob = sc.nextInt();
				System.out.println("Enter group");
				String group = sc.next();
				
				addInfo.setName(name1);
				addInfo.setNumber(mob);
				addInfo.setGroups(group);
				
				int count = addDao.addContact(addInfo);
				if(count>0)
					System.out.println("contact added");
				else
					System.out.println("cannot add contact");
				break;
			case 2:
				System.out.println("enter name to delete");
				String name2 = sc.next();
				PhoneDAO deleteDao = PhoneManagerFactory.getPhoneDAO();
				PhoneBean deleteInfo = new PhoneBean();
				int delcount = deleteDao.deleteContact( name2);
				if(delcount>0)
					System.out.println("contact deleted");
				
				break;
			case 3:
				System.out.println("Enter name to edit Contact_info");
				String ename = sc.next();
				System.out.println("Enter new Number");
				int number = sc.nextInt();
				System.out.println("Enter new group");
				String grp = sc.next();
				
				PhoneDAO editDao = PhoneManagerFactory.getPhoneDAO();
				PhoneBean editInfo = new PhoneBean();
				editInfo.setNumber(number);;
				editInfo.setGroups(grp);
				
				int editcount = editDao.editContact(editInfo, ename);
				if(editcount>0)
					System.out.println("contact updated");
				
				int editCount = editDao.editContact(editInfo,ename);
				if(editCount > 0)
					System.out.println("Contact Update");
				else
					System.out.println("Contact already updated");

			}
			break;
		}
	}

}

package com.ustglobal.hibernateassign.util;

import com.ustglobal.hibernateassign.dao.EmployeeDAO;
import com.ustglobal.hibernateassign.dao.EmployeeDAOImpl;

public class EmployeeManager {

	private EmployeeManager() {
		
	}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
	
}

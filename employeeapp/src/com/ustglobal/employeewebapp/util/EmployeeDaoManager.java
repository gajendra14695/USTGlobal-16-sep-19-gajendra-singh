package com.ustglobal.employeewebapp.util;

import com.ustglobal.employeewebapp.dao.EmployeeDAO;
import com.ustglobal.employeewebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	//private static EmployeeDAO EmployeeDaoJdbcImpl;

	private EmployeeDaoManager() {}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}

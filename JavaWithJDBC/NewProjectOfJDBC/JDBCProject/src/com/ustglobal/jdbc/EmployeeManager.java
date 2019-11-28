package com.ustglobal.empapp.util;

import com.ustglobal.employeedao.IEmployeeDAO;
import com.ustglobal.employeedao.EmployeeDAOImpl;

public class EmployeeManager {
	private EmployeeManager() {}
	public static IEmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}

package com.ustglobal.employeedao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface IEmployeeDAO {
	public List<EmployeeBean> getEmployee();
	public  EmployeeBean searchEmployee(int id);
	public int insertEmployeeData(EmployeeBean bean);
//	public int updateEmployeeData(EmployeeBean bean);
//	public int deleteEmployeeData(int id);
	
}

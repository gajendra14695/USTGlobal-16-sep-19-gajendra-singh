package com.ustglobal.beanobject.bean;

public class TestC {
public static void main(String[] args) {
	Student s =new Student();
	s.setID(12);
	s.setName("gajendra");
	s.setRollNo(45);
	Database db =new Database();
	db.receive(s);
	Employee e = new Employee();
	e.setId(243);
	e.setName("Gajendra singh");
	e.setSalary(23000);
	e.setDept(45);
	db.save(e);
}
}

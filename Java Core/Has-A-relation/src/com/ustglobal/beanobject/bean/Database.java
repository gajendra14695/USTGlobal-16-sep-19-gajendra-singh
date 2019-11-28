package com.ustglobal.beanobject.bean;

public class Database {
void receive(Student s) {
	System.out.println("Id is "+s.getId());
	System.out.println("Name is "+s.getName());
	System.out.println("Rollno is "+s.getRollNo());
}
void save(Employee e) {
	System.out.println("Id is "+e.getId());
	System.out.println("Salary is "+e.getSalary());
	System.out.println("name is "+e.getName());
	System.out.println("Rollno is "+e.getDept());
	System.out.println("Rollno is "+e.getDesignation());
}
}

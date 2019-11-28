package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	
public static void main(String[] args) {
	

	ManagerrEmployee s1= new ManagerrEmployee(2, "divya", 67.98);
	ManagerrEmployee s2= new ManagerrEmployee(3, "ambika", 56.98);
	ManagerrEmployee s3= new ManagerrEmployee(4, "dinesh", 46.98);
	ManagerrEmployee s4= new ManagerrEmployee(5, "piya", 56.98);
	ManagerrEmployee s5= new ManagerrEmployee(6, "kiran",546696.98);
	ManagerrEmployee s6= new ManagerrEmployee(7, "Shikha", 466386.98);
	ManagerrEmployee s7= new ManagerrEmployee(8, "Rahul", 506086.98);
	ManagerrEmployee s8= new ManagerrEmployee(9, "Bipin", 400086.98);
	ManagerrEmployee s9= new ManagerrEmployee(10, "neha", 86.98);

	
	ArrayList<ManagerrEmployee> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);

	ArrayList<ManagerrEmployee> all = new ArrayList<>();
	all.add(s4);
	all.add(s5);
	all.add(s6);
	
	ArrayList<ManagerrEmployee> al2 = new ArrayList<>();
	al2.add(s4);
	al2.add(s5);
	al2.add(s6);
	
	
	HashMap<String, ArrayList<ManagerrEmployee>> hm = new HashMap<String, ArrayList<ManagerrEmployee>>();
	hm.put("First", al);
	hm.put("Second", all);
	hm.put("third", al2);
	
ArrayList<ManagerrEmployee> first= 	hm.get("First");
	
Iterator<ManagerrEmployee> it = first.iterator();

while(it.hasNext()) {
	
	ManagerrEmployee s = it.next();
	System.out.println("id is "+s.id);
	System.out.println("name is "+s.name);
	
	System.out.println("percentage is "+s.salary);
System.out.println("======================");
}
}
}

package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {


	public static void main(String[] args) {

		Student s1= new Student(2, "divya", 67.98);
		Student s2= new Student(3, "ambika", 56.98);
		Student s3= new Student(4, "dinesh", 46.98);
		Student s4= new Student(5, "piya", 56.98);
		Student s5= new Student(6, "kiran", 96.98);
		Student s6= new Student(7, "kkiran", 86.98);
		Student s7= new Student(8, "kkiiran", 86.98);
		Student s8= new Student(9, "kkirran", 86.98);
		Student s9= new Student(10, "kkkiran", 86.98);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> all = new ArrayList<Student>();
		all.add(s4);
		all.add(s5);
		all.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("First", al);
		hm.put("Second", all);
		hm.put("third", al2);
		
	ArrayList<Student> first= 	hm.get("Second");
		
	Iterator<Student> it = first.iterator();
	
	while(it.hasNext()) {
		
		Student s = it.next();
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		
		System.out.println("percentage is "+s.percentage);
	System.out.println("======================");
	}
		
	}
}

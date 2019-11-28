package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(101,"salman",34.56);
		Student s2 = new Student(102,"shahrukh",34.56);
		Student s3 = new Student(103,"ankitha",3.56);
		Student s4 = new Student(104,"rahul gandhi",4.56);


		al.add(s1);
		al.add(s2);
		al.add(s3);

		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
		}
		System.out.println("=============for loop============");
		for (Student student : al) {
			
			System.out.println(student);
		}
	}
}

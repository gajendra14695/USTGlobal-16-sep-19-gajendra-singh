package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(12,"Dimple",35.6));
		al.add(new Student(5,"sweety",30.8));
		al.add(new Student(34,"Jimmy",68.9));
		al.add(new Student(6,"tummy",76.5));
		//System.out.println(al);
		System.out.println("Before sorting"
				+ ""
				+ ""
				+ "-------------->");
		displayStudentDetails(al);
		Collections.sort( al);
		
		
		
		
		
		System.out.println("After sort-------->");
//		for (Student student : al) {
//			System.out.println(student);
//		}
		displayStudentDetails(al);
	}


static	void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Nmae is "+s.name);
			System.out.println("Percentage is "+s.percentage);

			System.out.println("=================================");
		}
	}
}

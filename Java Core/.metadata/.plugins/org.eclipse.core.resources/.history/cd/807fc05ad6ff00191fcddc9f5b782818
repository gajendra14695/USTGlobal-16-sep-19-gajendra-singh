package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Pass {


	void display(ArrayList<Student> al) {
		Iterator<Student > it = al.iterator();
		while(it.hasNext()) {
			Student i = it.next();
			System.out.println("Id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("percentage is "+i.percentage);
			System.out.println("=======================================");
		}


	}

	void displayFailedStudent(ArrayList<Student> al) {
		List<Student > l =
				al.stream().filter(student ->student.percentage >=40).collect(Collectors.toList());


		Iterator<Student > it = l.iterator();
		while(it.hasNext()) {
			Student i = it.next();
			System.out.println("Id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("percentage is "+i.percentage);
			System.out.println("=======================================");
		}


	}

	void topper(ArrayList<Student> al) {

		Comparator<Student> cmp=(s1,s2)->{
			return s1.percentage>s2.percentage?1:s1.percentage<s2.percentage?-1:0;

		};
		Student k = al.stream().max(cmp ).get();
		System.out.println(k.id);
		System.out.println(k.name);
		System.out.println(k.percentage);

	}
}

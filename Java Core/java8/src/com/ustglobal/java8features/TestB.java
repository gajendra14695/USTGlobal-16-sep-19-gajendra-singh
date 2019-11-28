package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
			
		public static void main(String[] args) {
			
			
			
			Predicate<Student> p = s ->{
				if(s.percentage>=35)
					return true;
				else
					return false;
			};
			
			
			Student s = new Student(1, "sumit", 45.6);
			System.out.println(p.test(s));
		}
}

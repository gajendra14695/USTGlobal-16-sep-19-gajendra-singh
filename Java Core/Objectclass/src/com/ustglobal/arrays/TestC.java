package com.ustglobal.arrays;

public class TestC {
public static void main(String[] args) {
	Student s1=new Student(1,78.95,"arya");
	Student s2=new Student(2,7.5,"arya");
	Student s3=new Student(3,8.95,"arya");
	
	Student[] students=new Student[3];
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	for (Student student : students) {
		System.out.println(student);
	}
	receive(students);
	
	
}

private static void receive(Student[] stu) {
	for (int i = 0; i < stu.length; i++) {
		System.out.println(stu[i]);
	}
	
}
}

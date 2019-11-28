package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestD {
public static void main(String[] args) {
	System.out.println("Scanner Class");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name");
	String name =sc.nextLine();
	System.out.println("name is "+name);
	System.out.println("enter the age ");
	int age = sc.nextInt();
	System.out.println("age is "+age);
	System.out.println("ddsfdgkjv");

	String  s= sc.next();
	System.out.println("string is "+s);
	double d=sc.nextDouble();
	byte b =sc.nextByte();
	float f=sc.nextFloat();
	boolean bo=sc.nextBoolean();
}
}

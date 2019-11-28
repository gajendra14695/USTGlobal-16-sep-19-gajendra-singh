package com.ustglobal.exception.first;

public class TestB {
public static void main(String[] args) {
	System.out.println("main started");
	int a=10;
	int b = 0;
	try{
		 b=10/0;
		 System.out.println("hi");
	}catch(ArithmeticException ae) {
		System.out.println("number divided by Zero");
	}
	System.out.println(b);
System.out.println("main ended");
}
}

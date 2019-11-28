package com.ustglobal.exception.first;

public class TestF {
public static void main(String[] args) {
	System.out.println("main started");
	String s="hello";
	int[] a= {10,20,30};
	int b=10;
	
	try {
		String str=s.toUpperCase();
		System.out.println(str);
		System.out.println(a[2]);
		System.out.println(b/0);
	}catch(NullPointerException np) {
		System.out.println("dont playNUll pointer ");
	}
	catch(ArrayIndexOutOfBoundsException aei) {
		System.out.println("array index not persent");
	}
	catch(ArithmeticException ae) {
		System.out.println("number divided by zero");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Main Ended");
}
}

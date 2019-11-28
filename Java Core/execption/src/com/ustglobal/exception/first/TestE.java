package com.ustglobal.exception.first;

public class TestE {
public static void main(String[] args) {
	System.out.println("main started");
	String s="hello";
	int[] a= {10,20,30};
	int b=10;
	
	try {
		String str=s.toUpperCase();
		System.out.println(str);
		System.out.println(a[4]);
		System.out.println(b/0);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("exception occured");
	}
	
	
	System.out.println("Main Ended");
}
}

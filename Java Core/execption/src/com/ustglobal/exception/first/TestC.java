package com.ustglobal.exception.first;

public class TestC {
public static void main(String[] args) {
	System.out.println("Main Startded ");

	int[] a= {10,20,30};
	int b=10;
	try {	System.out.println(a[2]);
		System.out.println(b/0);
	
	}catch(ArithmeticException ae ) {
		System.out.println("number dividedd by zero");
	}
	try{
		System.out.println(a[4]);
	}
		catch(ArrayIndexOutOfBoundsException ai) {
	
		System.out.println("array index not present");
	}



	System.out.println("Main Ended");
}
}

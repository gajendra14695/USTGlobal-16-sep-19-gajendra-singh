package com.ustglobal.lambdaexpressions;

public class TestGreet {
public static void main(String[] args) {
	
	GreetInterface gf = (message)->{
		
		System.out.println("hello");
		
		System.out.println("hi");
		
	};
	gf.greet("hi");
}
}

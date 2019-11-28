package com.ustglobal.lambdaexpressions;

public class TestSayHi {
public static void main(String[] args) {
	
	SayHiInterface sf =()->System.out.println("hi");
	sf.sayHi();
}
}

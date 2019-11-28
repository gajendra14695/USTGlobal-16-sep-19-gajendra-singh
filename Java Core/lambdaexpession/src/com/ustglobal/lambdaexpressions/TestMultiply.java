package com.ustglobal.lambdaexpressions;

public class TestMultiply {
	public static void main(String[] args) {

		MultiplyInterface multi=(a,b)->a*b;
		
		System.out.println("product of number is "+multi.multiply(20, 10));
	}
}

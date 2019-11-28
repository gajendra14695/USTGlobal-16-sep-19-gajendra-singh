package com.ustglobal.java8features.predicate;

import java.util.function.Function;

public class TestPredicateA {

	
	public static void main(String[] args) {
		
		

	Function<Integer , Integer> p =i->i*i;
	
	System.out.println("Square of the number is "+p.apply(10));

	}
}

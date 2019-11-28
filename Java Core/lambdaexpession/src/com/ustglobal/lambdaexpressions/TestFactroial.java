package com.ustglobal.lambdaexpressions;

public class TestFactroial {
public static void main(String[] args) {
	FactorialInterface fi = (x)->{
		if(x==0||x==1)
			return 1;
		int fact=1;
		for (int i = 2; i <=x; i++) {
			fact =fact*i;
		}
			
		
		return fact;
	};
	System.out.println("Factorial is "+fi.fact(5));
}
}

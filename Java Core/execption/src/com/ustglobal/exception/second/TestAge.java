package com.ustglobal.exception.second;

public class TestAge {
public static void main(String[] args) {
	System.out.println("main started");
	
	Validator v =new Validator();
	
	try{
		v.verify(20);
		
	}catch(InvalidAgeException ie) {
		System.out.println("exception occured");
	}

		v.verify(13);

//		
		
	System.out.println("main ended");
}
}

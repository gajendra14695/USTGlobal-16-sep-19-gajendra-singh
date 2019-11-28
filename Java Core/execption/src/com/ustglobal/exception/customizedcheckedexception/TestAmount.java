package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("main started");
	
	ValidateAmount va =new ValidateAmount();
	try{
		va.checkedAmount(50000);
		System.out.println("withdraw your cash");
	}catch(InvalidAmountException e) {
		
		System.err.println(e.getMessage());
	}
	
	
	System.out.println("main ended");
}
}

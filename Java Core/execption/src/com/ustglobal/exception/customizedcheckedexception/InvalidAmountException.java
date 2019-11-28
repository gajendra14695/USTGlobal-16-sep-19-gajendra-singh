package com.ustglobal.exception.customizedcheckedexception;

public class InvalidAmountException extends RuntimeException {

	private String message ="Daliy limit 40,000";
	
	public String getMessage() {
		return message;
	}
}

package com.ustglobal.exception.second;

public class InvalidAgeException extends RuntimeException {
	
String message = "Invalid age below 18 year are not allow";
public InvalidAgeException() {
	
}
public InvalidAgeException(String message) {
	this.message=message;
}
//@Override
public String getmessage(){
	 
	return message;
	
 }
}

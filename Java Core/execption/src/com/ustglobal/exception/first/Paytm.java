package com.ustglobal.exception.first;

public class Paytm {
 void book() {
	 
	 System.out.println("Paytm Started");
	 
	 IRCTC ic = new IRCTC();
	 
	 ic.confirm();
	 
	 System.out.println("Paytm ended");
 
 }
}

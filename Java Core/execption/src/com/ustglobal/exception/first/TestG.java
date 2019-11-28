package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {

		System.out.println("main started");

		Paytm py =new Paytm();
		try{

			py.book();

		}catch(ArithmeticException ae) {

			System.out.println("Exception caught in main");

		}finally {

			System.out.println("exception finally");

		}
		System.out.println("main ended");
	}
}

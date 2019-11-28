package com.ustglobal.exception.second;

public class TestA {
	public static void main(String[] args)  {

		System.out.println("main started");

		try{

			Thread.sleep(3000);
			System.out.println("inside try block");

		}catch(InterruptedException ie) {

			System.out.println("Exception caught");

			ie.printStackTrace();

		}

		System.out.println("main ended");

	}
}

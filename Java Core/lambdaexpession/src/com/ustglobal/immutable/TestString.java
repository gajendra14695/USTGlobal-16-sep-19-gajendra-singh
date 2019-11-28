package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString m1 = new MyString(10,"priya rai");
		MyString m3 = m1.changeContant(20, "Mia Khalifa");
		System.out.println(m1.getRollno());
		System.out.println(m1.getName());
		MyString m2 = new MyString(10,"priya rai");
		System.out.println(m2);
		System.out.println(m2.getName());
		System.out.println(m2.getRollno());
		System.out.println("++++++++++++++++++++++++++");
		System.out.println(m3.getName());
		System.out.println(m3.getRollno());
	}
}

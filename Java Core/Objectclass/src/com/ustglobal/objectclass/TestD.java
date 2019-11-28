package com.ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Student s= new Student(10,"TestYantra",67.5);
	
	int code =s.hashCode();
	System.out.println(code);
//	s.printDetails();
	System.out.println(s);

}
}

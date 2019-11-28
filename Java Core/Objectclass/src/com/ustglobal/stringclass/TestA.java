package com.ustglobal.stringclass;

public class TestA {
public static void main(String[] args) {
	String s1="aishu";
	String s2="deepika";
	String s3 = new String("aishu");
	String s4 = new String("aishu");
	String s5 ="aishu";
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s5));
	
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s3.toLowerCase());
	
	System.out.println(s4.charAt(4));
	System.out.println(s1.equalsIgnoreCase("AiSHu"));
	StringBuffer sb1= new StringBuffer("kavya");
	System.out.println(sb1);
	
System.out.println(sb1.append(" Singh"));

}
}

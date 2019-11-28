package com.ustglobal.objectclass;

public class TestC {
public static void main(String[] args) {
	Marker m = new Marker();
	int h = m.hashCode();// it will give the hashcode in the integer form
	String  s =m.toString();//it will used  for full classified Class name and @ the hexadecimal code in the hashcode
	System.out.println(h);
	System.out.println(s);
	Marker p = new Marker();//it will overridden  
	System.out.println(p);
}
}

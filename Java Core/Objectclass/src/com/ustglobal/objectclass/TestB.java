package com.ustglobal.objectclass;

public class TestB {
public static void main(String[] args) {
	Pen p =new Pen();
	int phashCode = p.hashCode();
	System.out.println("Hashcode of p is "+phashCode);
	
	Pen q =new Pen();
	int qhashCode = q.hashCode();
	System.out.println("Hashcode of q is "+qhashCode);
	
}
}

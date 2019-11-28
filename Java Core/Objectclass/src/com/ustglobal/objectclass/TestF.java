package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Cow c = new Cow(2, "ganga", 100000);
		Cow c1 = new Cow(2, "ganga", 100000);
		Cow c2 = new Cow(3, "gowri", 200000);
		Cow c4=c1;
		boolean isEqual=c.equals(c2);
		System.out.println(isEqual);
		System.out.println(c.equals(c1));
		System.out.println(c2.equals(c1));
		System.out.println(c4.equals(c1));
System.out.println(c1.hashCode());
System.out.println(c.hashCode());
System.out.println(c2.hashCode());
	}
}

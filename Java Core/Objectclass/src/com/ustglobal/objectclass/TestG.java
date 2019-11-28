package com.ustglobal.objectclass;

public class TestG {
public static void main(String[] args) {
	Employee  e =new Employee(1, "gajendra", 566766);
	Employee  e1 =new Employee(2, "gajju", 6766);
	Employee  e2 =new Employee(1, "gajendra", 566766);
	System.out.println(e.equals(e1));
	System.out.println(e.equals(e2));
	System.out.println(e1.equals(e2));
	System.out.println(e);
	System.out.println(e1);
	System.out.println(e2);
}
}

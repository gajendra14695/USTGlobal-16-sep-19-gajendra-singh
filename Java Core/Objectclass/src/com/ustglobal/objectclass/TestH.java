package com.ustglobal.objectclass;

public class TestH {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p= new Person(12 , "ravi");
	System.out.println("p id "+ p.id);
	System.out.println("p name "+p.name);
	Object o =p.clone();
	Person p2=(Person) o;
	System.out.println("p2 id is "+p2.id);
	System.out.println("p2 name is "+p2.name);
	
	p2.id = 200;
	p2.name="gajendra";
	
	System.out.println("*****************After Cloning****************************");
	System.out.println("p id "+ p.id);
	System.out.println("p name "+p.name);
	System.out.println("p2 id is "+p2.id);
	System.out.println("p2 name is "+p2.name);
	
	
}
}

package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	
	LinkedList<Laptop> ll = new LinkedList<Laptop>();
	
	ll.add(new Laptop(25000,4,"HP"));
	ll.add(new Laptop(35000,6,"Dell"));
	ll.add(new Laptop(10000,12,"MAC"));
	ll.add(new Laptop(50000,8,"Asus"));
	displayLaptopDetails(ll);
	Collections.sort(ll);
	System.out.println("=======================");
	displayLaptopDetails(ll);
	
	
}
static void displayLaptopDetails(LinkedList<Laptop> l) {
	Iterator<Laptop> it = l.iterator();
	while(it.hasNext()) {
		Laptop lll =it.next();
		System.out.println("Name is "+lll.name);
		System.out.println("Price is "+lll.price);
		System.out.println("Ram is "+lll.ram);
		System.out.println("==========================================");
		
		
	}
}
}

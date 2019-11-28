package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
public static void main(String[] args) {
	
	LinkedList<Pen> lp = new LinkedList<Pen>();
	lp.add(new Pen(23.459,"montex","red"));
	lp.add(new Pen(235.57,"cello","black"));
	lp.add(new Pen(123.05,"jeter","pink"));
	lp.add(new Pen(45.05,"dom","white"));
	
	Collections.sort(lp);
	displayLaptopDetails(lp);
	//System.out.println(lp);
	
}
static void displayLaptopDetails(LinkedList<Pen> l) {
	Iterator<Pen> it = l.iterator();
	while(it.hasNext()) {
		Pen lll =it.next();
		System.out.println("Name is "+lll.brand);
		System.out.println("Price is "+lll.price);
		System.out.println("color is "+lll.color);
		System.out.println("==========================================");
		
		
	}
}
}

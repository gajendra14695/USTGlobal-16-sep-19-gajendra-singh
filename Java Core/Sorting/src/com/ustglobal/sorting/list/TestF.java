package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestF {

	public static void main(String[] args) {

		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(40,"pink"));
		al.add(new Marker(60,"black"));
		al.add(new Marker(90,"red"));
		System.out.println("Before sorting------------>");
		display(al);

		System.out.println("===========================Using Lambda expression===============");
		Collections.sort(al,(o1,o2)->{
			return (o1.price>o2.price)?1:-1;
		});
		System.out.println("After sorting------------>");
		display(al);
		sortByColor sc = new sortByColor(); 
		System.out.println("sort by price --------------------------->");
	Collections.sort(al,sc);
	display(al);

	}

	static void display(ArrayList<Marker> l) {
		Iterator<Marker> it = l.iterator();
		while(it.hasNext()) {
			Marker lll =it.next();
			System.out.println("Name is "+lll.name);
			System.out.println("Price is "+lll.price);
			//System.out.println("color is "+lll.color);
			System.out.println("==========================================");


		}
	}
}

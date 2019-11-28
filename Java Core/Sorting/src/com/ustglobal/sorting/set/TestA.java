package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);
		hs.add(null);
		//hs.add(null);
		System.out.println(hs.add(56.7));
		
		
		System.out.println("=========for each==================");
		for (Object object : hs) {
			System.out.println(object);
		}
		
		System.out.println("===============using Iterator==================");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}

package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	
		public static void main(String[] args) {
			HashSet<String> hs = new HashSet<>();
			hs.add("gajju");
			hs.add("rahul");
			hs.add("shikha");
			hs.add("nisha");
			hs.add("nikil");
			hs.add("naven");
			hs.add("khalifa");
			
			
			
			
			System.out.println("=========for each==================");
			for (String s : hs) {
				System.out.println(s);
			}
			
			System.out.println("===============using Iterator==================");
			
			Iterator it = hs.iterator();
			while(it.hasNext()) {
				Object o = it.next();
				System.out.println(o);
			}
			
		}
}

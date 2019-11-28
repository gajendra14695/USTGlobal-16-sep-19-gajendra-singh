package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestC {
		
		public static void main(String[] args) {
			
			LinkedHashSet is = new LinkedHashSet();
			is.add(34);
			is.add("nikitha");
			is.add(89.67);
			is.add(34);
			is.add("bhavya");
			is.add(105.67);
			is.add(null);
		
			
			
			System.out.println("=========for each==================");
			for (Object s : is) {
				System.out.println(s);
			}
			
			System.out.println("===============using Iterator==================");
			
			Iterator it = is.iterator();
			while(it.hasNext()) {
				Object o = it.next();
				System.out.println(o);
			}
		}

}

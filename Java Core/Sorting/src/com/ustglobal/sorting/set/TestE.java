package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	
		public static void main(String[] args) {
			
			TreeSet<String> ts = new TreeSet<String>();
			ts.add("roopa");
			ts.add("jaya");
			ts.add("sushma");
			ts.add("munni");
			ts.add("sheela");
			
			
			System.out.println("=========for each==================");
			for (String s : ts) {
				System.out.println(s);
			}
			
			System.out.println("===============using Iterator==================");
			
			Iterator<String> it = ts.iterator();
			while(it.hasNext()) {
				String o = it.next();
				System.out.println(o);
			}
			
		}
}

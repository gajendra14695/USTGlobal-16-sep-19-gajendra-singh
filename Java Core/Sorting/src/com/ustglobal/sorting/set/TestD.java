package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	
		public static void main(String[] args) {
			
			LinkedHashSet<Double > is = new LinkedHashSet<Double>();
			
			is.add(23.45);
			is.add(233.45);
			is.add(235.45);
			is.add(23.645);
			is.add(23.405);
			
			System.out.println("=========for each==================");
			for (Double s : is) {
				System.out.println(s);
			}
			
			System.out.println("===============using Iterator==================");
			
			Iterator<Double> it = is.iterator();
			while(it.hasNext()) {
				Double o = it.next();
				System.out.println(o);
			}
		}
}

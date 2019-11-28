package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
			
			public static void main(String[] args) {
				
				
				TreeSet ts = new TreeSet();
				ts.add(34);
				ts.add(304);
				ts.add(034);
				ts.add(3674);
				ts.add(3884);
			//	ts.add("deepika");//ClasscastException
				//ts.add(null);//NullPointerException
				System.out.println("=========for each==================");
				for (Object s : ts) {
					System.out.println(s);
				}
				
				System.out.println("===============using Iterator==================");
				
				Iterator<Double> it = ts.iterator();
				while(it.hasNext()) {
					Object o = it.next();
					System.out.println(o);
				}
				
			}

}

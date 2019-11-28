package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		
	
		Comparator<Employe> com = (e1,e2)->{
			return e1.height<e2.height?1:e1.height>e2.height?-1:0;
		};
		

		TreeSet<Employe> ts = new TreeSet<Employe>(com);
		ts.add(new Employe(4,"niki",5.6));
		ts.add(new Employe(1,"basker",5.2));
		ts.add(new Employe(3,"suresh",5.1));
		ts.add(new Employe(5,"dinesh",4.5));

		System.out.println("===============***using iterator***====================");
		Iterator<Employe> it = ts.iterator();
		while(it.hasNext()) {
			Employe e =it.next();
			System.out.println("Name is "+e.name);
			
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("============================================");
		}
	}
}

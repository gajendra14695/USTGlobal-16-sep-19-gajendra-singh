package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	al.add(23);
	al.add(23.4);
	al.add(true);
	al.add(false);
	al.add("chandu");
	al.add(23);
	
	
	Iterator it = al.iterator();
	Object ol = it.next();
	
	System.out.println("obj1 "+ol);
	

	Object o2 = it.next();
	System.out.println("obje "+o2);
	
	Object o3 = it.next();
	System.out.println("obje "+o3);
	Object o4 = it.next();
	System.out.println("obje "+o4);
	
	Object o5 = it.next();
	System.out.println("obje "+o5);
	
	Object o6 = it.next();
	System.out.println("obje "+o6);
	
	
	

	System.out.println("===========================");
	
	
	for (int i = 0; i < 6; i++) {
	
		Object o =al.get(i);
		
		System.out.println(o);

	}
	System.out.println("++++++++++++++++++++++++++++++++++++");
ArrayList all = new ArrayList();
	
	all.add(23);
	all.add(23.4);
	all.add(true);
	all.add(false);
	all.add("chandu");
	all.add(2);
	
	
	Iterator itt = all.iterator();
	while(itt.hasNext()) {
		Object o = itt.next();
		System.out.println(o);
	}
for (; itt.hasNext(); ) {
	
}

}
}

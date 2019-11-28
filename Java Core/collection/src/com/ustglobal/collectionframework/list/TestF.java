package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("anupama");
	al.add("savitha");
	al.add("kavitha");
	al.add("sunitha");
	String name =al.get(1);
	System.out.println(name.toUpperCase());
	Iterator<String > li = al.iterator();
	while(li.hasNext()) {
		String s = li.next();
		System.out.println(s);
	}
	System.out.println("++++++++++++USING LIST ITERATOR+++++++++++++++++++++++++++");
	ListIterator<String> l =al.listIterator();
	while(l.hasNext()) {
		String s =l.next();
		System.out.println(s);
	}
	System.out.println("+++++++++++++Using for loop");
	for (String string : al) {
		System.out.println(string);
	}
}
}

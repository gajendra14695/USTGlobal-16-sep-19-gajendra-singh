package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		System.out.println("Before sort "+l);
		Collections.sort(l);
	System.out.println("After sort"+l);
	
	Collections.reverse(l);
	System.out.println("After reverse "+l);
	
	Collections.shuffle(l);
	System.out.println("After Shuffle "+l);
	
	}
}

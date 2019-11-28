package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
public static void main(String[] args) {
	
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(34.5);
	al.add(349.5);
	al.add(634.5);
	al.add(534.5);
	al.add(304.95);
	al.add(34.5);
	al.add(null);
	
	System.out.println(al);
	al.add(2, 69.69);
	System.out.println("After the Second index"+al);
	al.remove(0);
	System.out.println("remove 0th index"+al);
	al.remove(null);
	System.out.println("remove null "+al);
	Double val = al.get(4);
	System.out.println("Object 4 th index"+al);
	al.set(2, 96.96);
	System.out.println("After "+al);
	al.clear();
	System.out.println(al);
	al.contains(54.5);
	System.out.println(al);
	System.out.println("==============================================================");
	
	ArrayList<Double > al1= new ArrayList<>();
	al1.add(12.3);
	al1.add(23.4);
	al1.add(34.5);
	al.addAll(al1);
	System.out.println("After add all "+al);
	boolean contain = al.containsAll(al1);
	System.out.println("contain all f al1 "+al1);
	System.out.println("Before remove "+al);
	boolean res = al.removeAll(al1);
	System.out.println("Remove all of al1 "+res);
	System.out.println("After remove "+al);
	
	


}
}

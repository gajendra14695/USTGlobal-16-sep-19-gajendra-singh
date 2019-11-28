package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("girija");
	al.add("vanag");
	al.add("gajju");
	al.add("kiran");
	
	System.out.println("Before sort -------->"+al);
	Collections.sort(al);
	System.out.println("After sort --------->"+al);
	
}
}

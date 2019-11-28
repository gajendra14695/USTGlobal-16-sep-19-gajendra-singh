package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(23);
	al.add(23.4);
	al.add(true);
	al.add(false);
	al.add("chandu");
	al.add(23);
	for (Object object : al) {
		System.out.println(object);
	}
}
}

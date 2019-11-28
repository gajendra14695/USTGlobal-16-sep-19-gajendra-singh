package com.ustglobal.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		MySingleton my = MySingleton.getDbConnection();
		my.s="hello";
		System.out.println("hashcode of my  "+my.hashCode());
		MySingleton ms = MySingleton.getDbConnection();
		ms.s="hi";
		System.out.println("Hashcode of ms  "+ms.hashCode());
		System.out.println(my.s);
		System.out.println(ms.s);
		
	}
}

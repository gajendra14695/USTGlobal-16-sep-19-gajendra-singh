import java.util.*;

import java.util.Scanner;
public class TestA {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50,60,};
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	String[] ar = {"gajedra","gajju","guru","kirti"};
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	System.out.println("========================");
	for (String string : ar) {
		System.out.println(string);
	}
	double[] db= {12.3,34.5,56.6,67.8};
	for (int i = 0; i < db.length; i++) {
		System.out.println(db[i]);
	}
	for (double d : db) {
		System.out.println(d);
	}


}
}

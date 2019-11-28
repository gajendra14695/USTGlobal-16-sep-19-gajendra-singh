package com.ustglobal.arrays;

public class TestA {
public static void main(String[] args) {
	int[] a = new int[5];
	a[0]=0;
	a[1]=1;
	a[2]=2;
	a[3]=3;
	a[4]=4;
	System.out.print("Array elements ");
	int[] b= {10,20,30,40,50};
	for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
		
	}
	System.out.println();
	System.out.print("Array elements ");
	for(int n :b) {
		System.out.print(n+" ");
		
	}
	char[] ch= {'a','b','c'};
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]+" ");
	}
	for (char c : ch) {
		System.out.println(c);
	}
	byte[] e = {1,2,3,4,5};
	for(int i=0;i<e.length;i++){
		System.out.println(e[i]+" ");
	}
	for (byte c : e) {
		System.out.println(c);
	}
	double[] r= {2.4,6.7,8.9};
	for (int i = 0; i < r.length; i++) {
		System.out.println(r[i]);
	}
	for (double d : r) {
		System.out.println(d);
	}
	boolean[] f= {true,false,true,false};
	for (int i = 0; i < f.length; i++) {
		System.out.println(f[i]);
	}
	String[] g= {"gajendra","rahul,","bipin","shikha"};
	for (int i = 0; i < g.length; i++) {
		System.out.println(g[i]);
	}
	for (String string : g) {
		System.out.println(string);
	}
}
}

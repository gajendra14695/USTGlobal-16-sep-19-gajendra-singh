package com.ustglobal.arrays;

public class TestB {
public static void main(String[] args) {
	int[] num= {10,20,30,40};
	String[] g= {"gajendra","rahul,","bipin","shikha"};
	//System.out.println(num[10]);//java.lang.ArrayIndexOutOfBoundsException
	receive(num);
	receive1(g);
	int[] values=getArray();
	for (int i = 0; i < values.length; i++) {
		System.out.println(values[i]);
	}
	String[] f=getString();
	for (int i = 0; i < f.length; i++) {
		System.out.println(f[i]);
	}
	
}
static void receive(int[] number) {
	for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
	}
	System.out.println("+++++++++++++++++++++++++++");
	for (int i : number) {
		System.out.println(i);
	}
}
static int[] getArray() {
	int[] values= {20,30,40,50,60};
	return values;
}
static String[] receive1(String[] str) {
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	return str;
}
	static String[] getString() {
		String[] g= {"gajendra","rahul,","bipin"};
		return g;
	}
}


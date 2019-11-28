package com.ustglobal.atmmachine;

public class testA {
public static void main(String[] args) {
	Machine m =new Machine();
	HDFC h1 =new HDFC();
	m.slot(h1);
	ICICI i =new ICICI();
	m.slot(i);
	SBI sbi = new SBI();
	m.slot(sbi);
}
}

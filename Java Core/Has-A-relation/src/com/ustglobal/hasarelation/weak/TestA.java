package com.ustglobal.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Person p =new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		p.m.write();
		System.out.println(p.m.color);
		p.m.size=20;
		System.out.println(p.m.size);
	}
}

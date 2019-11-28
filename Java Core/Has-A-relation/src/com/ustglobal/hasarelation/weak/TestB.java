package com.ustglobal.hasarelation.weak;

public class TestB {
public static void main(String[] args) {
	Car c =new Car();
	System.out.println(c.price);
	System.out.println(c.color);
	System.out.println(c.m.song);
	c.m.play(); 
	c.move();
}
}

package com.ustglobal.objectclass;

public class TestE {
public static void main(String[] args) {
	
	Car c1= new Car(768,"BMW","RED");
	Car c2= new Car(79,"maruti","blue");
	Car c3= new Car(708,"Auto","yellow");
	int c=c1.hashCode();
	System.out.println(c);
	System.out.println(c1);
	int c4=c2.hashCode();
	System.out.println(c4);
	System.out.println(c2);
	int c5=c3.hashCode();
	System.out.println(c5);
	System.out.println(c3);
}
}

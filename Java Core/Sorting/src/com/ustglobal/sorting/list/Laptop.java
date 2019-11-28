package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
int price;
int ram;
String name;
public Laptop(int price, int ram, String name) {
	super();
	this.price = price;
	this.ram = ram;
	this.name = name;
}
@Override
public String toString() {
	return "Laptop [price=" + price + ", ram=" + ram + ", name=" + name + "]";
}
//public int compareTo(Laptop o) {
//	Integer i = this.ram;
//	Integer j = o.ram;
//	
//	return i.compareTo(j);
//}
//public int compareTo(Laptop o) {
//	String i = this.name;
//	String j = o.name;
//	
//	return i.compareToIgnoreCase(j);
//}
//@Override
//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return 0;
//}
public int compareTo(Laptop o) {

	return this.price>o.price?-1:this.price<o.price?1:0;
}


}

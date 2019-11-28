package com.ustglobal.sorting.list;

public class Marker {
int price ;
String name;
public Marker(int price, String name) {
	super();
	this.price = price;
	this.name = name;
}
@Override
public String toString() {
	return "Marker [price=" + price + ", name=" + name + "]";
}

}

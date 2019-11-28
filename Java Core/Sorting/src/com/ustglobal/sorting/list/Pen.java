package com.ustglobal.sorting.list;



public class Pen  implements Comparable<Pen>{


	double price;
	String brand;
	String color;
	public Pen(double price, String brand ,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand +""+color+ "]";
	}
	
//	public int compareTo(Pen o) {
//		
//		return this.price>o.price?-1:this.price<o.price?1:0;
//	}
public int compareTo(Pen o) {
		
	String i = this.brand;
	String j = o.brand;
	return i.compareToIgnoreCase(j);
	}


	
}

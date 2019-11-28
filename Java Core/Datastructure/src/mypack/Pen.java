package mypack;

public class Pen implements Comparable {
String color;
double Price;
public  Pen(String color, double Price) {
	this.color=color;
	this.Price=Price;
	
}
public String toString() {
	return "["+color+","+Price+"]";
}
@Override
public int compareTo(Object o) {

	Pen p1=(Pen)o;
	if(this.Price<p1.Price)
		return  -1;
	else
		return 1;
	
	
}
}


public class Bus {
int seat;
String color;
Bus(int seat, String color){
	this.seat=seat;
	this.color=color;
}
Bus(){
	this(40);
	
}

Bus(int seat){
	this(seat,"red");
}

void getDetail() {
	//System.out.println("Wlcome to redbus , bus seat colr is "+color);
	System.out.println("Wlcome to redbus , bus seat capacity is "+seat);
}
public static void main(String[] args) {
	Bus b =new Bus();
	b.getDetail();
	
	Bus b1 =new Bus(50);
	b1.getDetail();
	//Bus b2 =new Bus("blue");
}
}

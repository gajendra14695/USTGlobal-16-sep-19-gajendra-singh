
public class TestA {
public static void main(String[] args) {
	Pen p = new Pen();
	p.cost = 100;
	p.color="black";
	p.brand ="parker";
	p.write();
	System.out.println("Cost of pen is"+p.cost);
	System.out.println("Color of the pen is "+p.color);
	System.out.println("brand of the pen"+p.brand);
	
	System.out.println("*******************VAN MODEL1************************************");
	Van v= new Van();
	Van v1=new Van();
	
	v.cost=30000;
	v.color="white";
	v.move();
	
	System.out.println("cost of the van is "+v.cost);
	System.out.println("color of the van is "+v.color);
System.out.println("********Van Model2******");
v1.cost=300001;
v1.color="yellow";
v1.move();
	System.out.println("cost of the van is "+v1.cost);
	System.out.println("color of the van is "+v1.color);


}
}

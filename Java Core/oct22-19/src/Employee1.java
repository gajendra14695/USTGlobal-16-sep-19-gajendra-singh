
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name , int id)
	{
		this.name = name;
		this.eid = id;

	}
	void printDetail()
	{
		System.out.println(" Name of the Employee = "+name);
		System.out.println(" eid of the Employee = "+eid);
		this.sayHello();
	}
	void sayHello()
	{
		System.out.println("Hello "+name+" Welcome to UST Global company");
	}
	public static void main(String[] args) {

		Employee1 e1 =new Employee1("Pirya rai",143);
		e1.printDetail();
		Employee1 e2 =new Employee1("Alia",420);
		e2.printDetail();
		Employee1 e3 =new Employee1("Sunney",69);
		e3.printDetail();
}
}


public class Employee {
	String name;
	int eid;
	public Employee(String empname , int empid)
	{
		name = empname;
		eid = empid;

	}
	void printDetail()
	{
		System.out.println(" Name of the Employee = "+name);
		System.out.println(" eid of the Employee = "+eid);
	}	
	public static void main(String[] args) {

		Employee e1 =new Employee("Pirya rai",143);
		e1.printDetail();
		Employee e2 =new Employee("mia khalifa",420);
		e2.printDetail();
		Employee e3 =new Employee("Sunney",69);
		e3.printDetail();
	}
}

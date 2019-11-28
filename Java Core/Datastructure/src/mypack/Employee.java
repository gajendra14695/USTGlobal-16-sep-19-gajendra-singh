package mypack;

import java.util.Comparator;

public class Employee implements Comparator{
	int id;
	String name;
	double sal;
	public  Employee(int id,String name, double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	public String toString() {
		return "["+id+","+name+","+sal+"]";
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2 =(Employee)o2;
		if(e1.sal<e2.sal)
			return -1;
		else
			return 1;
	}


}

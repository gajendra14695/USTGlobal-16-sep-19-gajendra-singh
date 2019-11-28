import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
public static void main(String[] args) {
	
	List<Empl> em = new ArrayList<Empl>();
	em.add(new Empl(1,"Gajendra","Male"));
	em.add(new Empl(2,"G","Female"));
	em.add(new Empl(3,"Ram","Male"));
	em.add(new Empl(4,"khalifa","Female"));
	
	System.out.println("=============for each loop=============");
	for (Empl empl : em) {
		System.out.println(empl);
	}
	System.out.println("++++++++++++++++Using Iterator=================");
	Iterator<Empl> it = em.iterator();
	while(it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}



}
}

class Empl{
	int id ;
	 String name;
	 String sex;
	public Empl(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	 
}
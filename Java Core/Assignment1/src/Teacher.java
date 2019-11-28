import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teacher {
public static void main(String[] args) {
	
	
	List<Teach> em = new ArrayList<Teach>();

	em.add(new Teach(1,"Gajendra","Male"));
	em.add(new Teach(2,"G","Female"));
	em.add(new Teach(3,"Ram","Male"));
	em.add(new Teach(4,"khalifa","Female"));
	
	System.out.println("=============for each loop=============");
	for (Teach empl : em) {
		System.out.println(empl);
	}
	System.out.println("++++++++++++++++Using Iterator=================");
	Iterator<Teach> it = em.iterator();
	while(it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}

}
}
class Teach{
	int id ;
	 String name ;
	 String dept;
	public Teach(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Teach [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	 
}
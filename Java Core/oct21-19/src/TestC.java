
public class TestC {
	public static void main(String[] args) {
		
		Person p =new Person();
		p.name="gajendra";
		Person.color="black";
		p.age=22;
		p.eat();
		p.walk();
		Person.sleep();
		System.out.println("name of the person is "+p.name);
		System.out.println("color of the person is "+Person.color);
		System.out.println("age of the person  is "+p.age);

	}

}

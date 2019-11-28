
public class TestB {

	public static void main(String[] args) {
		System.out.println("***************************COW ****************");
		Cow c=new Cow();
		c.name="ramdulari";
		c.color="brown";
		c.eat();
		c.sleep();

		System.out.println("cow name is "+c.name);
		System.out.println("cow name is "+c.color);

		System.out.println("***************************COW 2 ****************");
		Cow c1=new Cow();
		c1.name="bashanti";
		c1.color="white";
		c1.eat();
		c1.sleep();

		System.out.println("cow name is "+c1.name);
		System.out.println("cow name is "+c1.color);

	}
}


public class StdentA {
	int id;
	String name;
	String sex;
	int age;
	int mobile;
	StdentA( String name,int id,String sex,int age,int mobile)

	{
		this.name=name;
		this.age =age;
		this.sex=sex;
		this.id=id;
		this.mobile=mobile;

	}
	void display()
	{
		System.out.println("Name of the student is ="+this.name);
		System.out.println("ID of the student is ="+this.id);
		System.out.println("Sex of the student is ="+this.sex);
		System.out.println("Age of the student is ="+this.age);
		System.out.println("Mobile of the student is ="+this.mobile);

	}
	public static void main(String[] args) {
		StdentA s = new StdentA ("Gajendra",1,"male",23,76);
		s.display();
		StdentA s1 = new StdentA ("Rahul",2,"male",21,76);
		s1.display();
	}
}

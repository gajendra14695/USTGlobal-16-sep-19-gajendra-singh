
public class Students  extends Person{
	int rollno;
	double marks;
	Students(String name , int age ,int rollno ,double marks){
		super("dssf",54);
		System.out.println("name is ="+name);
		System.out.println("age is =" +age);
		System.out.println("rollno is="+rollno);
		System.out.println("Marks is ="+marks);
	}
	public static void main(String[] args) {
		Students s=new Students("gajendrs",23,5454,67.7);

	}
}

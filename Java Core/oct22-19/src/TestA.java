
public class TestA {
public static void add(int a, int b)
{
	System.out.println(" add(int a , int b) methhod");
}
public static void  add(long a, int b)
{
	System.out.println(" add(int a , int b) methhod");

}
public static int  add(int a, byte b)
{
	System.out.println(" add(int a , int b) methhod");
	return a+b;
}
public int multiply(int a ,int b ) {
	System.out.println("Multiply(int a,int b) method");
	return a+b;
}
public static void main(int a) {
	System.out.println("10101010101");
}
static int a;
public static void main(String[] args) {
	main(01);
	add(10,20);
	add(12,49);
	TestA t =new TestA();
	
	t.multiply(12,5);
	System.out.println(a);
	
}

}

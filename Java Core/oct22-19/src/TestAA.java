
public class TestAA {

	void show(int x)
	{
		System.out.println("hello show");
	}
	String show(int x, int y)
	{
		System.out.println("hello int x, int y");
		return "helo";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestAA a =new TestAA();
a.show(10);
	}

}

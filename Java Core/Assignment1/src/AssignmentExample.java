
public class AssignmentExample {

	private void m1() {
		System.out.println("aaa");
	}
}
class B extends AssignmentExample{

	private void m1() {
		System.out.println("bbbb");
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		//a.m1();
	}
}

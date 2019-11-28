
public class TestB extends Student {
void add()
{
	System.out.println("This is final class");
}
public static void main(String[] args) {
	TestB t = new TestB();
	t.printDetail();
t.add();
}
}

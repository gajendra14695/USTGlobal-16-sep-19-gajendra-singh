
public class TestG {
final void add()
{
	System.out.println("Add() method");
}
final void add(int a)
{
	System.out.println("add(int a) method");
}
public static void main(String[] args) {
	SuperClass sup =new SuperClass();
	System.out.println("************************");
	TestG tg =new TestG();
	tg.add();
	tg.add(10);
}
}

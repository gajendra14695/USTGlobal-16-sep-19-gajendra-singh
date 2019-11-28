
public class TestD {
public static void main(String[] args) {
	Btm b=new Btm();
	b.swipe();
	Btm b1=new Btm();
	//b1.swipe();
	int count=b.getCount();
	System.out.println("count is "+count);
	int totalcount=b.getTotalCount();
	System.out.println("totalcount is "+totalcount);
	
	//b1=b.swipe();
}
}

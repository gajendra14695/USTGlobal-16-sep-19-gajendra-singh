package mypack;
import java.util.Comparator;
public class MyComparator implements Comparator {

	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
		String str=(String)o1;
		String str1=(String)o2;
		
		return -str.compareTo(str1) ;
	}

}

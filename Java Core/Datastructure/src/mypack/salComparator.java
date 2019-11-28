package mypack;

import java.util.Comparator;

public class salComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2 =(Employee)o2;
		if(e1.sal<e2.sal)
			return -1;
		else
			return 1;
	}

	
	
}

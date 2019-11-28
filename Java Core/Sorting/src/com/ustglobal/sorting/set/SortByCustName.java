package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByCustName implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		String i = o1.name;
		String j = o2.name;
		
		return i.compareTo(j);
	}

}

package com.ustglobal.sorting.list;

import java.util.Comparator;

public class sortByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker o1, Marker o2) {
		String s=o1.name;
		String t= o2.name;
		return  s.compareTo(t);
	}

}

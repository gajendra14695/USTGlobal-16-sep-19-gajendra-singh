package com.ustglobal.sorting.set;

import java.util.Comparator;

public class Employe implements Comparator<Employe> {

		
		int id ;
		String name;
		double height;
		public Employe(int id, String name, double height) {
			super();
			this.id = id;
			this.name = name;
			this.height = height;
		}
		@Override
		public String toString() {
			return "Employe [id=" + id + ", name=" + name + ", height=" + height + "]";
		}
		@Override
		public int compare(Employe o1, Employe o2) {
			
			return 0;
		}
		
}

package com.ustglobal.sorting.list;

public class Student  implements Comparable<Student> {
	int id;
	String name ;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(Student o) {
	
		return this.id<o.id?-1:this.id>o.id?1:0;
		//return this.name<o.name?-1:this.name>o.name?1:0;
		
	}
	
//	@Override
//	public int compareTo(Student o) {
//	
//		return this.percentage<o.percentage?-1:this.percentage>o.percentage?1:0;
//		//return this.name<o.name?-1:this.name>o.name?1:0;
//		
//	}
//	@Override
//	public int compareTo(Student o) {

		 //if (!this.name.equalsIgnoreCase(o.name))
	        //    return this.name.compareToIgnoreCase(o.name);
//	        if (!this.model.equalsIgnoreCase(other.model))
//	            return this.model.compareTo(other.model);
//	        return this.year - other.year
//		return 0;
//		
//		
//		String  p =this.name;
//		String q = o.name;
//		return p.compareTo(q);
//		
//		Integer i = this.id;
//		Integer j= o.id;
//		return i.compareTo(j);
//		
//	}
	
	
	

}

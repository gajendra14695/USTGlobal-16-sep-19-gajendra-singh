package com.ustglobal.arrays;

public class Student {
int id;
double percentage;
String name;
public Student(int id, double percentage, String name) {
	super();
	this.id = id;
	this.percentage = percentage;
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", percentage=" + percentage + ", name=" + name + "]";
}

}

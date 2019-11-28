package com.ustglobal.objectclass;

public class Student {
int id ;
String name;
double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
public int hashCode() {
	return id;
}
public String toString() {
	return "Id Student "+id+" Name  Student "+name+" Percentage Student"+percentage;
}
void printDetails() {
	System.out.println("Id Student "+id+" Name  Student "+name+" Percentage Student"+percentage);
}
public void pritn() {
	// TODO Auto-generated method stub
	
}
}

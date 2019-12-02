package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

private Author author;
private String name;
private double price;
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@PostConstruct
public void init() {
	System.out.println(" Init methid executing from Hello ");
}
@PreDestroy
public void destroy() {
	System.out.println("destroy method executing from Hello ");
}
}

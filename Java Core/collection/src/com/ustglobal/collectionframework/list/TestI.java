package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		
	
Stack  ll = new Stack();
ll.add(12);
ll.add(12.54);
ll.add("gajju");
ll.add("sohil");

for (int i = 0; i < ll.size(); i++) {
	System.out.println(ll.get(i));
}


System.out.println("+++++++++++++Using for loop");
for (Object object : ll) {
	System.out.println(object);
}

System.out.println("++++++++++++USING LIST ITERATOR+++++++++++++++++++++++++++");
ListIterator l =ll.listIterator();
while(l.hasNext()) {
	Object s =l.next();
	System.out.println(s);
}

System.out.println("=================================");
Iterator li = ll.iterator();
while(li.hasNext()) {
	Object s =li.next();
	System.out.println(s);
}
System.out.println("++++++++++++++++++has previous");

System.out.println("----------->Forword");
ListIterator lt = ll. listIterator();
while(lt.hasNext()){
	
	Object ob =lt.next();
	System.out.println(ob);
			
}
System.out.println("BackWord<-----------");
while (lt.hasPrevious()) {

	Object o =lt.previous();
	System.out.println(o);
	
}
}
}
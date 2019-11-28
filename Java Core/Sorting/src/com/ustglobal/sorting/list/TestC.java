package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {


	public static void main(String[] args) {


		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(23);
		ll.add(34);
		ll.add(54);
		ll.add(67);
		ll.add(77);
		
		System.out.println("Peek Element "+ll.peek());
		System.out.println("PeekFirstElements "+ll.peekFirst());
		System.out.println("PeekLastElements "+ll.peekLast());
		System.out.println(ll);
		System.out.println("================== After Peek ");
		
		
		System.out.println("Poll elements "+ll.poll());
		System.out.println("pollFirst "+ll.pollFirst());
		System.out.println("poll last elemeents "+ll.pollLast());
		System.out.println(ll);
		
		System.out.println("=================push===============");
		
		ll.push(12);
		
		System.out.println("Push element "+ll);
		System.out.println(" pop "+ll.pop());
		
	}
}

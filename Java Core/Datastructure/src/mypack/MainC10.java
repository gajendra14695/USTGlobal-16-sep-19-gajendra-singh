package mypack;

import java.util.PriorityQueue;

public class MainC10 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue( new salComparator());
		pq.offer(new Employee(128,"Green",122343));
		pq.offer(new Employee(127,"Gajendra singh",27000));
		pq.offer(new Employee(125,"himanshu",30000));
		pq.offer(new Employee(123,"Ropendra Yadav",25000));
		pq.offer(new Employee(124,"Amrit raj",27000));
		System.out.println(pq);
		System.out.println(pq.poll());
		
		for(Object obj :pq) {
			System.out.println(obj);
			
		}
		System.out.println("======================================");
		System.out.println(pq.poll());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}


}

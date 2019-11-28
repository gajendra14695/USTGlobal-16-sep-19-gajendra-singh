package mypack;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MainC9 {
public static void main(String[] args) {
	Comparator com=new MyComparator();
	PriorityQueue pq=new PriorityQueue();
	pq.add("A");
	pq.add("B");
	pq.add("C");
	pq.add("D");
	pq.add("E");
	pq.add("J");
	pq.add("F");
	pq.add("E");
	System.out.println(pq);
	System.out.println(pq.poll());
	
}
}

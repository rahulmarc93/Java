package dsa;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(20);
		q.add(20);
		q.add(22);
		q.add(23);
		q.add(24);
		q.add(25);
		//display elemnts from queue
		System.out.println(q);
		int a=q.remove();
		System.out.println(q);
		System.out.println("Removed element is:"+a);
		//head or peek Elemnts
		int head=q.peek();
		System.out.println("Peek Elements is:"+head);
		//poll()--->remove  head elements
		System.out.println("Elements are:"+q.poll());
		System.out.println(q);
		System.out.println(q.size());

	}

}

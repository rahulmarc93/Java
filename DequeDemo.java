package dsa;

import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		//offer-to add new elemnts
		dq.offer(60);
		System.out.println(dq);
		dq.offerFirst(80);
		System.out.println(dq);
		dq.offerLast(90);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
	}
}

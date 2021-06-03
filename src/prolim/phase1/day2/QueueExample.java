package prolim.phase1.day2;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(20);
		q.add(30);
		q.add(55);
		q.add(65);
		
		System.out.println(q.peek()); // print top element of queue
		
		System.out.println(q.poll()); // print top element and remove the element as well
		System.out.println(q.peek());
		System.out.println(q.contains(55));
		System.out.println(q.hashCode());
	}

}

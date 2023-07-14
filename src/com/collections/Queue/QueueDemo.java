package com.collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("John");
		queue.add("tom");
		queue.add("Tijohn");
		queue.add("Johni");
		queue.add("mitol");

		// get the all details of Queue
		System.out.println(queue);

		// to find head elements

		System.out.println(queue.element());

		// to get the head elements using peek() method also

		System.out.println(queue.peek());

		// iterator cursor we can used in Queue for find all elements
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		// removal head of the elements from queue
		queue.remove();
		queue.poll();

	}

}

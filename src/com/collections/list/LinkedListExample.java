package com.collections.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	
		LinkedList<Integer> ll =new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		ll.add(1,15);
		System.out.println(ll);
		
		// get the last index object 
		System.out.println(ll.getLast());

	}

}

package com.collections.Queue;

import java.util.ArrayDeque;

public class ArrayDQueueExamp {

	public static void main(String[] args) {
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		
		ad.add("one");
		ad.add("Two");
		ad.add("Three");
		ad.add("Four");
		ad.addFirst("Vijay"); // add the elements first 
		ad.addLast("Patole");  // add the elements from last 
		
		
		System.out.println(ad);
		// removal of first elements
		ad.pollFirst();
		System.out.println(ad);
		
		// removal of last elements 
		ad.pollLast();
		System.out.println(ad);
     
		
		
		
		
		
	}

}

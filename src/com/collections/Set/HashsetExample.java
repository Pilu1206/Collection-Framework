package com.collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs =new HashSet<>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("five");
		
		System.out.println(hs);
		
		// remove the object from set 
		hs.remove("five");
		System.out.println("After removing the five "+hs);
		
		// using iterator we can get the data 
		Iterator<String> iterator =hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}

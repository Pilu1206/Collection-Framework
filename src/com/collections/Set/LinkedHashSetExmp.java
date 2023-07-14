package com.collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExmp {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(null);
		lhs.add(10);
		
		System.out.println(lhs);
	}

}

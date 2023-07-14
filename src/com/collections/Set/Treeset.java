package com.collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	
		// Create treeset constructer
		TreeSet<Integer> Tr =new TreeSet<>();
		
		//create treeSet 
		Tr.add(10);
		Tr.add(30);
		Tr.add(20);
		Tr.add(60);
		Tr.add(50);
		
		System.out.println(Tr);
		
		Iterator<Integer> inte =Tr.iterator();
		while(inte.hasNext()) {
			System.out.println(inte.next());
		}
			
		}
		 {
		

	}

}

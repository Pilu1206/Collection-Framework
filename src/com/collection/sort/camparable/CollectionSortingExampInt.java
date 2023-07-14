package com.collection.sort.camparable;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingExampInt {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<>();
		al.add(50);
		al.add(20);
		al.add(140);
		al.add(106);
		al.add(204);
		al.add(177);
	 // get the all elements 
	System.out.println("Before sorting elements list :"+al);
	
	// sort the elements 
	
	Collections.sort(al);
	
	
	System.out.println( "After sorting elements list :"+al);
	
	Collections.reverse(al);
	System.out.println( "After reverse elements list is :"+al);
	
	}
	
	

}

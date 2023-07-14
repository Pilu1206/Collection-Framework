package com.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
	
		Vector<Integer> V =new Vector<>();
		
		
		V.add(100);
		V.add(200);
		V.add(300);
		V.add(400);
		
		System.out.println(V);
		
		
		Enumeration<Integer> la =V.elements();
		
	 while(la.hasMoreElements()) {
		 System.out.println(la.nextElement());
	 }
		 
		
	

	}

}

package com.collections.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample3 {

	public static void main(String[] args)  throws IOException{
		// create the list of students  id 
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		
		// find the number of students  in list 
		// using for loop 
		System.out.println("list of students "+l.size());
		
		System.out.println("====for loop Aaproach====");
		
		for(int i =0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("==== for Each loop ====");
		// list of students using for each loop
		for (int l1:l) {
			System.out.println("id of students :"+l1);
			
		}
		System.out.println("====for using iterater ==== ");
		//  find list of students using iterator
		
		Iterator<Integer> iter =l.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
				
			
					
				}
			}
			
			
		}
	
	
	     
		
		

	



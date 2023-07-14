package com.collection.sort.Failsafe.FsCollections;

import java.util.ArrayList;

public class FailFastCollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al  =new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		// fail fast collections 
		for(int i :al) {
			System.out.println(i);
			if (i==1) {
				al.add(10);
				
			}
			
		}
	}

}

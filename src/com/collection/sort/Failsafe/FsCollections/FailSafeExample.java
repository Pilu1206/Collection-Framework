package com.collection.sort.Failsafe.FsCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
	
		
		// concurrent modification
		CopyOnWriteArrayList<Integer> al =new CopyOnWriteArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		// this is fail safe collections 
		for(int i:al) {
			System.out.println(i);
			if(i==100) {
				al.add(150);
			}
			
		}
		System.out.println(al);
        
	}

}

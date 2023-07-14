package com.collection.sort.Failsafe.FsCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SFailSafeConcurrent {

	public static void main(String[] args) {

       ConcurrentHashMap<Integer, String>  map =new ConcurrentHashMap<>();
       
   	
		map.put(101,"rag ");
		map.put(102,"tag ");
		map.put(104,"cab ");
		map.put(105,"bab ");
		
		Set<Integer> keySet = map.keySet();	
		Iterator<Integer> iter =keySet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
			map.put(103, "yag");
	}
		System.out.println(map);

}
}

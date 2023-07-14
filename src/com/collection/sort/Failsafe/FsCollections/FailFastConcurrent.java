package com.collection.sort.Failsafe.FsCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FailFastConcurrent {

		public static void main(String[] args) {
			
			HashMap<Integer,String> map =new HashMap<>();
			
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
		}

}

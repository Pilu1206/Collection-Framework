package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExamp5 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(10);
		al.add(30);
		
		
		System.out.println(al.size());
		
		for(int al1:al) {
			System.out.println(al1);
		}
		//
		Iterator<Integer> str =al.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	}

}

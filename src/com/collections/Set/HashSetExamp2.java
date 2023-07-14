package com.collections.Set;

import java.util.HashSet;
import java.util.Iterator;

import com.collections.list.Student;

public class HashSetExamp2 {

	public static void main(String[] args) {
		
		HashSet<Student> hs =new HashSet<>();
		
		hs.add(new Student(10,"yaju"));
		hs.add(new Student(20,"taju"));
		hs.add(new Student(30,"saju"));
		hs.add(new Student(40,"paju"));
		
		Iterator<Student> Iterator =hs.iterator();
		while(Iterator.hasNext()) {
			System.out.println(Iterator.next()); // Insertion order in not maintain 
		}

	}

}

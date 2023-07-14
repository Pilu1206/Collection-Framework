package com.collections.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collections.list.Student;

public class StudentMapDemo {
	
	public static void main(String[] args) {
		
		Student s1 =new Student(101,"kajal");
		Student s2 =new Student(102,"pranjal");
		Student s3 =new Student(103,"Gaurav");
		
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		
		System.out.println(map);
		
		// find all key and values elements 
		Set<Entry<Integer, Student>> entrySet = map.entrySet();
		for(Entry<Integer,Student> entry:entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		// get all the keySet
		Set<Integer> keySet = map.keySet();	
		for(Integer key : keySet) {
			System.out.println(map.get(key));
			
		}
		
		
			
		}
	}



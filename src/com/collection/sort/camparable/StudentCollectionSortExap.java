package com.collection.sort.camparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class StudentCollectionSortExap {
	
	public static void main(String[] args) {
		
		ArrayList<Student1> al =new ArrayList<>();
		al.add(new Student1(101, "vijay",3));
		al.add(new Student1(103, "aijay",4));
		al.add(new Student1(104, "kartik",1));
		al.add(new Student1(102, "jaswal",2));
		
		
		// sorting order of students 
		Collections.sort(al);
		
		// print the all student information
		for(Student1 s:al) {
			System.out.println(s);
		}
	}

}

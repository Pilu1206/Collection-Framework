package com.collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> obj = new ArrayList<>();

		// add the student
		obj.add(new Student(1, "Raju"));
		obj.add(new Student(2, "kaju"));
		obj.add(new Student(3, "saju"));
		obj.add(new Student(4, "paju"));
		obj.add(new Student(5, "Gaju"));

		// get the student list using for each loop
		for (Student s : obj) {
			System.out.println(s.toString());
		}

		System.out.println("===reverse the student list ===");
		// get the reverse id from student
		for (int i = obj.size() - 1; i >= 0; i--) {
			System.out.println(obj.get(i));
		}

		System.out.println("======using List iterater======");

		// using Listiterator

		ListIterator<Student> li = obj.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}

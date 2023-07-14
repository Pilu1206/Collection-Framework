package com.collection.sort.camparable;

public class Student1 implements Comparable<Student1> {

	int id;
	String name;
	int Rank;

	// we can used parameterizes constructer it is used to initilize the class

	public Student1(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		Rank = rank;
	}

	// we can used tostring method because of it is used to print the object data
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", Rank=" + Rank + "]";
	}

	// we can used to sort collection comparable predefined method here
	@Override
	public int compareTo(Student1 s) {
		// return this.id - s. id;
		
		// when we used based on String sorting use campareTo() method
		//return this.name.compareTo(s.name);
		
		//based on the rank sorting 
		return this.Rank-s.Rank;
	}

}

package com.collections.list;

public class Student {

	int id ;
	String name;
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

package com.collections.list;

import java.util.ArrayList;

public class ArraylistEx2 {

	public static void main(String[] args) {

		// create arraylist for books

		ArrayList<String> Arry = new ArrayList<>();

		// add book in lists
		Arry.add("Marathi");
		Arry.add("English");
		Arry.add("Science");
		Arry.add("Georraphy");
		Arry.add("History");

		System.out.println("Number of the books :" + Arry.size());

		// Print the list of books
		System.out.println("List of all books ");
		for (@SuppressWarnings("unused") String Arry1 : Arry) {
			System.out.println(Arry);

		}
		// check the book available in lists
		String searchbook ="Science";
		if(Arry.contains(searchbook)) {
			System.out.println("book is found in list"+searchbook);
		} else {
			System.out.println("book is  not found in list"+searchbook);
			
		}
		// remove the books from list
		String removebook ="History";
		Arry.remove(4);
		System.out.println(removebook +"has been removed");
		
		// updated list of books
		System.out.println("Updated list of book ");
		for(@SuppressWarnings("unused") String Arry2:Arry) {
			System.out.println(Arry);
		}
	}

}

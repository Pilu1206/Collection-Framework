package com.collections.list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	
		 // Create an ArrayList to store books
        ArrayList<String> books = new ArrayList<>();

        // Add books to the ArrayList
        books.add("Java: A Beginner's Guide");
        books.add("Effective Java");
        books.add("Head First Java");
        books.add("Clean Code");
        books.add("Data Structures and Algorithms in Java");

        // Print the number of books in the ArrayList
        System.out.println("Number of books: " + books.size());

        // Print all the books in the ArrayList
        System.out.println("List of books:");
        for (String book : books) {
            System.out.println(book);
        }

        // Check if a specific book is present in the ArrayList
        String searchBook = "Effective Java";
        if (books.contains(searchBook)) {
            System.out.println(searchBook + " is found in the list.");
        } else {
            System.out.println(searchBook + " is not found in the list.");
        }

        // Remove a book from the ArrayList
        String removeBook = "Clean Code";
        books.remove(removeBook);
        System.out.println(removeBook + " has been removed.");

        // Print the updated list of books
        System.out.println("Updated list of books:");
        for (String book : books) {
            System.out.println(book);
        }
    


	}

}

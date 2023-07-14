package com.collection.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number:");
		int i =sc.nextInt();
		
		System.out.println("Enter Second number:");
		int j =sc.nextInt();
		
		System.out.println("Result :"+(i+j));
		sc.close();
	}

}

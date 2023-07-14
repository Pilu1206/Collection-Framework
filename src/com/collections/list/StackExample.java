package com.collections.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		
		Stack<Integer> s =new Stack<>();
        
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		
		System.out.println(s.peek()); // peek it means LIFO 
		System.out.println(s.pop()); // remove the top elements and retain that 
		System.out.println(s);
		
		
	}

}

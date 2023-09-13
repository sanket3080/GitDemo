package com.java;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	for(int i=0;i<5;i++) {
		al.add(i);
	}
	//printing all elements of ArrayList al
	System.out.println(al); 
	
	//removing element at index 3
	al.remove(3);
	
	System.out.println(al);
	
	//printing all element one by one 
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		}
	}

}

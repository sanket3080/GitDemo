package com.java;
import java.util.*;
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages=new ArrayList<>();
		
		//adding elements to array list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		
		System.out.println("Languages ArrayList: "+languages);
		
		//get the element at specific position
		String lang=languages.get(1);
		System.out.println("Element at index 1: "+lang);
		
		// updating the arrayList element
		languages.set(2, "Kolin"); 
		System.out.println("Modified Languages ArrayList: "+languages);
		
		//removing an element from ArrayList
		languages.remove(2);
		System.out.println("Languages ArrayList after removing element at index 2: "+languages);
		
		//adding more elements to arrayList
		
		languages.add("C");
		languages.add("C++");
		languages.add("Ruby");
		System.out.println("Languages: "+languages);
		
		//sorting arrayList
		Collections.sort(languages);
		System.out.println("Languages arrayList after sorting : "+languages);
		
		//printing size of Arraylist
		System.out.println("Size of languages arrayList is: "+languages.size());
		
	}

}

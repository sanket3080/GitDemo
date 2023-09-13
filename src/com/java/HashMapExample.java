package com.java;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		//adding elements to HashMap
		map.put("Tryion", 1);
		map.put("John", 2);
		map.put("Sansa", 3);
		
		System.out.println("Map: "+map);
		
		//printing size of HashMap
		System.out.println("Size of HashMap is: "+map.size());
		
		//checking if the HashMap contains a key
		System.out.println("Dose the hashmap contain key Sansa: "+map.containsKey("Sansa"));
		
		if(map.containsKey("Tryion")) {
			Integer value=map.get("Tryion");
			
			System.out.println("Value for key Tyrion is: "+value);	
		}
		
		// getting value of a key
		System.out.println("Value of key John is: "+map.get("John"));
		
	}

}

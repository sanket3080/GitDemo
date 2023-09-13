package com.java;
import java.util.*;
import java.util.Map.Entry;
public class HashMapExample2 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();
		
		HashMap<Integer, String> hm2=new HashMap<Integer, String>()	;
		
		hm1.put(1, "One");
		hm1.put(2, "Two");
		hm1.put(3, "Three");
		
		hm2.put(4, "Four");
		hm2.put(5, "Five");
		hm2.put(6, "Six");
		
		System.out.println("Mappings of HashMap hm1 are: "+hm1);
		System.out.println("Mappings of HashMap hm2 are: "+hm2);
		
		//traversal of HashMap
		
		for (Entry<Integer, String> e : hm1.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
				
	}

}

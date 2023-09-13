package collections;

import java.util.HashMap;

public class HashMapExample2 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		
		hashMap.put("John",25);
		hashMap.put("Jane",20);
		hashMap.put("Jim", 35);
		
		System.out.println(hashMap);
		System.out.println("HashMap Size: "+hashMap.size());
		
		System.out.println(hashMap.get("Jim"));
		
		hashMap.remove("Jim");
		
		System.out.println(hashMap.containsKey("Jim"));
		System.out.println(hashMap);
		System.out.println("HashMap Size: "+hashMap.size());
		
		hashMap.put("Jane", 50);
		System.out.println(hashMap);
	}

}

package collections;

import java.util.HashMap;

public class HashMapExample3 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1=new HashMap<>();
		
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();
		
		hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
  
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        
        System.out.println("Mapping of hm1 are: "+hm1);
        System.out.println("Mapping of hm2 are: "+hm2);
		
	}

}

package collections;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> studentList=new HashMap<Integer, String>();
		
		studentList.put(01, "Tryion");
		studentList.put(02, "John");
		studentList.put(03, "Arya");
		
		System.out.println("Size of the studentList Hashmap is: "+studentList.size());
		
		System.out.println("StudentList: "+studentList);
		
		if(studentList.containsKey(1)) {
			String name=studentList.get(1);
			System.out.println("Value of key 1 is: "+name);
		}
	}

}

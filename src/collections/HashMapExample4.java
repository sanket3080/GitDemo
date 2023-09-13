package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample4 {

	public static void main(String[] args) {
		Map<Integer, String> hm1 = new HashMap<>();

		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}

}

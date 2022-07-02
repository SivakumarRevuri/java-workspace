package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		/* insertion order will preserved
		 Map<String, Integer> map = new LinkedHashMap<>(); */
		map.put("shiv", 100);
		map.put("kumar", 200);
		map.put("tony", 300);
		map.put("pavan", 400);
		map.put("kaylan", 500);
		// insertion order won't be maintained and stored based on hashcode of keys
		System.out.println(map);
		// in HashMap equals() used to identify duplicate keys
		// update the value of shiv; it return's old value
		System.out.println("old value: " + map.put("shiv", 1000));
		// fetch the records using get();
		System.out.println("value of shiv: " + map.get("shiv"));
		// if get() try's to fetch the records but record not found it return's null
		System.out.println("value of dummy key: " + map.get("dummy"));

		Set<String> keys = map.keySet();
		System.out.println("all keys of map: " + keys);
		Collection<Integer> values = map.values();
		System.out.println("all values of map: " + values);

		// entry set

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) itr
					.next();
			System.out.println("key: " + entry.getKey() + " & value: " + entry.getValue());
			if (entry.getKey().equals("tony")) {
				entry.setValue(555);
			}
		}
		System.out.println(entrySet);
		System.out.println("map: " + map);

		Map<String, Integer> synchroniZed = Collections.synchronizedMap(map);
		System.out.println(synchroniZed);
	}

}

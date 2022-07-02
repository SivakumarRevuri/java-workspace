package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// insertion order will be maintained here.
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("shiv", 100);
		map.put("kumar", 200);
		map.put("tony", 300);
		map.put("pavan", 400);
		map.put("kaylan", 500);
		System.out.println(map);
	}
}

package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		normalHashMap();
		identityHashMap();
	}

	private static void normalHashMap() {
		Map<Integer, String> test = new HashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		test.put(i1, "shiv");
		test.put(i2, "tony");

		System.out.println("HashMap " + test);

	}

	private static void identityHashMap() {
		// In IdentityHashMap it used == to check duplicate keys
		Map<Integer, String> test = new IdentityHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		test.put(i1, "shiv");
		test.put(i2, "tony");

		System.out.println("identity hashamap " + test);
	}
}

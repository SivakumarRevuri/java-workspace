package com.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		Car c1= new Car("8799", "ferrari");
		Car c2= new Car("3905", "Benz");
		Car c3= new Car("5332", "BMW");
		Car c4= new Car("8799", "maruti");
		HashSet<Car> hst= new HashSet<Car>();
		hst.add(c1);
		hst.add(c2);
		hst.add(c3);
		hst.add(c4);
		System.out.println("size of the hashset is: "+hst.size());
		System.out.println();
		for (Car c : hst) {
			System.out.println(c);
		}
	}
}

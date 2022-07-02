package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		City c1= new City("delhi",500004);
		City c2= new City("Hyderabad",500001);
		City c3= new City("bangalore",500654);
		City c4= new City("mumbai",500037);

		LinkedList<City> lst= new LinkedList<City>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		lst.add(c4);
		
		Iterator<City> Iterator = lst.iterator();
        while (Iterator.hasNext()) {
            System.out.println(Iterator.next()); 
            }
	
		
	}
}
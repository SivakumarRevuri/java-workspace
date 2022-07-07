package com.practice.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EleminatingDuplicate {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("hyderabad");
		arrayList.add("patna");
		arrayList.add("telangana");
		arrayList.add("delhi");
		arrayList.add("hyderabad");
		
		Set<String> set= new HashSet<>(arrayList);
		
		System.out.println(set);
		
	}
}

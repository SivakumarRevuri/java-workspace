package com.practice.collection;

import java.util.LinkedHashSet;

public class HashSetTest {

    public static void main(String[] args) {

	HashSetUser hd1 = new HashSetUser(12, "siva");
	HashSetUser hd2 = new HashSetUser(142, "kumar");
	HashSetUser hd3 = new HashSetUser(126, "revuri");
	HashSetUser hd4 = new HashSetUser(22, "siva");
	HashSetUser hd5 = new HashSetUser(152, "siva");

	LinkedHashSet<HashSetUser> linkedHashSet = new LinkedHashSet<HashSetUser>();
	linkedHashSet.add(hd1);
	linkedHashSet.add(hd2);
	linkedHashSet.add(hd3);
	linkedHashSet.add(hd4);
	linkedHashSet.add(hd5);
	System.out.println(linkedHashSet.size());
	linkedHashSet.forEach(user -> System.out.println(user));

    }
}

package com.practice;
// create our own array list

public class ShivaList {

    private Object obj[];
    int cc = 0;
    int index = 0;

    ShivaList() {
	obj = new Object[cc];
    }

    ShivaList(int cp) {
	cc = cp;
	obj = new Object[cc];
    }

    // we are using this method to add elements to ShivaList
    private boolean add(Object ob) {

	if (index == cc) {
	    cc = cc * 3 / 2 + 1;
	    Object no[] = new Object[cc];
	    for (int i = 0; i < obj.length; i++) {
		no[i] = obj[i];
	    }
	    obj = no;
	}
	obj[index] = ob;
	index++;
	return true;
    }

    // to print in a meaningful manner we will override toString method
    @Override
    public String toString() {
	String st = "[";
	for (int i = 0; i < obj.length; i++) {
	    st = st + obj[i] + ",";
	}
	st = st + "]";
	return st;
    }

    // size method to show the size of the list
    int size() {
	return index;
    }

// clear method to clear the entire data in the list
    public void clear() {
	if (obj != null) {
	    obj = null;
	}
    }

    public static void main(String[] args) {
	ShivaList sl = new ShivaList();
	sl.add("siva");
	sl.add("kumar");
	sl.add("revuri");
	sl.add("good");
	sl.add("boy");

	System.out.println(sl);
	System.out.println(sl.size());
    }

}

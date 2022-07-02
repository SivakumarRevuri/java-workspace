package com.practice;

public class Arraylst {
    private Object obj[];
    int cc = 10;
    int index = 0;

    Arraylst() {
	obj = new Object[cc];
    }

    Arraylst(int initcap) {
	cc = initcap;
	obj = new Object[cc];
    }

    boolean add(Object ob) {
	if (index == cc) {
	    cc = cc * 3 / 2 + 1;
	    Object n[] = new Object[cc];
	    for (int i = 0; i < obj.length; i++) {
		n[i] = obj[i];
	    }
	    obj = n;
	    obj[index] = ob;
	    index++;
	} else {
	    obj[index] = ob;
	    index++;
	}
	return true;
    }

    boolean remove(Object ob) {
	for (int i = 0; i < index; i++) {
	    if (obj[i] == ob) {
		while (i < index - 1) {
		    obj[i] = obj[i + 1];
		    i++;
		}
		index--;
		return true;
	    }
	}
	return false;
    }

    boolean add(Object ob, int in) {
	if (in < index) {
	    int i = index;
	    while (i >= in) {
		obj[i] = obj[i - 1];
		i--;
	    }
	    obj[in] = ob;
	    index++;
	    return true;
	}
	return add(ob);
    }

    @Override
    public String toString() {
	String st = "[";
	for (int i = 0; i < obj.length; i++) {
	    st = st + obj[i] + ",";
	}
	st = st + "]";
	return st;
    }

    public static void main(String[] args) {
	Arraylst al = new Arraylst(5);
	al.add("sam");
	al.add("Ram");
	al.add("jsp");
	al.add("qsp");
	al.add("btm");
	System.out.println(al);
	al.remove("sam");
	System.out.println(al);
    }
}

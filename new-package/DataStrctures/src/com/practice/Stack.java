package com.practice;

import java.util.Iterator;

public class Stack {
    Object obj[] = new Object[10];
    int cc = 10, top = -1;

    Stack(int initcap) {
	cc = initcap;
	obj = new Object[cc];
    }

    public Stack() {
	obj = new Object[cc];
    }

    boolean push(Object ele) {
	top++;
	if (top == cc) {
	    cc = cc + 5;
	    Object n[] = new Object[cc];
	    for (int i = 0; i < obj.length; i++) {
		n[i] = obj[i];
	    }
	    obj = n;
	}
	obj[top] = ele;
	return true;
    }

    Object pop() {
	if (top == -1) {
	    System.out.println("stack is underflow");
	    return null;
	}
	return obj[top--];
    }

    Object peek() {
	if (top == -1) {
	    System.out.println("stack is underflow");
	    return null;
	}
	return obj[top];
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
	Stack s = new Stack(5);
	s.push("a");
	s.push("b");
	s.push("c");
	s.push("d");
	System.out.println(s);
	s.pop();
	System.out.println(s);
	boolean b = isBalanced("[[]]{}");
	System.out.println(b);
    }

    Iterator<?> iterator() {
	class A implements Iterator<Object> {
	    int in = 0;

	    public boolean hasNext() {
		return in < size();
	    }

	    public Object next() {
		return obj[in++];
	    }
	}
	return new A();
    }

    public int size() {
	return cc;
    }

    static boolean isBalanced(String st) {
	String s = "(()){}";
	Stack stk = new Stack();
	char ch[] = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
	    if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
		stk.push(ch[i]);
	    } else {
		char pc = (char) stk.pop();
		switch (ch[i]) {
		case '}':
		    if (pc != '{')
			return false;
		case ')':
		    if (pc != '(')
			return false;
		case ']':
		    if (pc != '[')
			return false;
		default:
		    return false;
		}
	    }
	}
	return true;
    }
}

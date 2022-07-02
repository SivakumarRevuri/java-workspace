package com.practice;

public class SingleLinkedList {
    class Node {
	Object data;
	Node link;

	public Node(Object data) {
	    this.data = data;
	}
    }

    Node head;

    boolean add(Object obj) {
	Node n = new Node(obj);

	if (head == null) {
	    head = n;
	    return true;
	}
	Node t = head;
	while (t.link != null) {
	    t = t.link;
	}
	t.link = n;
	return true;
    }

    boolean addFirst(Object obj) {
	Node n = new Node(obj);
	n.link = head;
	head = n;
	return true;
    }

    void display() {
	Node t = head;
	while (t != null) {
	    System.out.print(t.data + "---->");
	    t = t.link;
	}
    }

    boolean add(Object obj, int pos) {
	if (pos == 1) {
	    addFirst(obj);
	}
	int cnt = 1;
	Node n = new Node(obj);
	Node t = head;
	while (t != null) {
	    if (cnt == pos - 1)
		break;
	    t = t.link;
	    cnt++;
	}
	if (t == null)
	    return false;
	n.link = t.link;
	t.link = n;
	return true;

    }

    Object deleteFirst() {
	if (head != null) {
	    Object obj = head.data;
	    head = head.link;
	    return obj;
	}
	return null;

    }

    Object deleteLast() {
	if (head != null) {
	    Node t = head, t1 = head;
	    while (t.link != null) {
		t1 = t;
		t = t.link;
	    }
	    t1.link = null;
	    return t.data;
	}
	return null;
    }

    static void reverse(Node n) {
	if (n.link != null)
	    reverse(n.link);
	System.out.print(n.data + "<----");
    }

    public static void main(String[] args) {
	SingleLinkedList s = new SingleLinkedList();
	s.add("R");
	s.add("B");
	s.add("G");
	s.add(234);
	s.addFirst(123);
	s.add("P", 3);
	s.add("Raj", 7);
	s.display();
	System.out.println();
	s.deleteFirst();
	s.display();
	System.out.println();
	s.deleteLast();
	s.display();
	System.out.println();
	reverse(s.head);
    }
}

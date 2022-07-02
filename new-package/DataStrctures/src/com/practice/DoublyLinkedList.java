package com.practice;

public class DoublyLinkedList {
class Node
{
	Node next;
	Node prev;
	Object data;
	Node(Object data)
	{
		this.data=data;
	}
	
	}
Node head=null;
boolean add(Object obj)
{
	try {
		Node n=new Node(obj);
		if(head==null) {
			head=n;
			return true;
		}
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			n.prev=t;
			t.next=n;
			return true;
		}
	 catch (Exception e) {
		// TODO: handle exception
		return false;
	}
	}
void display() {
	Node t=head;
	while (t!=null) {
		System.out.print(t.data+"<--->");
		t=t.next;
	}
	System.out.println();
}
boolean addFirst(Object obj)
{
	Node n= new Node(obj);
	n.next=head;
	head=n;
	return true;
}
boolean add(Object obj,int pos)
{
	try {
	int cnt=0;
	Node n=new Node(obj);
	Node t=head;
	while (t!=null) {
		if(pos==1)
		{
			addFirst(obj);
		}
		cnt++;
		if(cnt==pos)
			break;
		t=t.next;
	}
	n.next=t;
	n.prev=t.prev;
	t.prev.next=n;
	t.prev=n;
	return true;
	}
	catch (Exception e) {
		// TODO: handle exception
	return false;
	}
}
boolean deleteFirst()
{
	try {
		head.next.prev=null;
		head=head.next;
		return true;
	} catch (Exception e) {
		// TODO: handle exception
	return false;
	}
	}
Object deleteFirst1()
{
	try {
		head.next.prev=null;
		Object obj=head.data;
		head=head.next;
		return obj;
	} catch (Exception e) {
		// TODO: handle exception
	return null;
	}
	}
Object deleteLast()
{
	try {
		Node t=head;
		while (t.next!=null) {
			t=t.next;
		}
		Object obj=t.data;
		t.prev.next=null;
		return obj;
	} catch (Exception e) {
		// TODO: handle exception
		return null;
	}
	}
boolean delete(int pos)
{
	try {
int cnt=0;
	Node t=head;
	while(t!=null)
	{
		cnt++;
	if(cnt==pos) 
	 break;
  t=t.next;
	}
	t.prev.next=t.next;
	t.next.prev=t.prev;
	return true;
	}
	catch (Exception e) {
		// TODO: handle exception
		return false;
	}
	
}
public static void main(String[] args) {
	DoublyLinkedList dl=new DoublyLinkedList();
	dl.add("jsp");
	dl.add("qsp");
	dl.add("3i");
	dl.addFirst("sam");
	dl.add("ram",1);
	dl.display();
	System.out.println(dl.deleteFirst1());
	System.out.println(dl.deleteLast());
	dl.display();
	dl.delete(1);
	dl.display();
	
}
}

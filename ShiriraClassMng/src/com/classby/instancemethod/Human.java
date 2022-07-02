package com.classby.instancemethod;

public class Human {
void eat()
{
	washHands();
	arrangePlates();
	serveFood();
	keeepPlatesInSink();
	}

  void keeepPlatesInSink() {
	  System.out.println("keep plates in sink");
	  }

void serveFood() {
	System.out.println("serve food");
	
}

void arrangePlates() {
	System.out.println("arrange plates");
	
}

void washHands() {
	System.out.println("wash hands");
	
}
public static void main(String[] args) {
	Person p=new Person();
	p.eat();
}
	
}


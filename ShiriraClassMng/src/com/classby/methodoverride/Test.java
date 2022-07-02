package com.classby.methodoverride;

public class Test {
	public static void main(String[] args) {
		Crocadile c= new Crocadile();
		c.eat();
		Snake s= new Snake();
		s.eat();
		Cow co= new Cow();
		co.eat();
	}

}

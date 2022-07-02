package com.casting.expmple2;

import java.util.Random;

public class Game {

	Prize throwAndGet() {
		Prize p=null;

		Random r= new Random();
		int i= r.nextInt(5);
		System.out.println(i);
        
		if (i==1){
			
			p= new Pen();
			System.out.println("congrants you got pen");
		}
		else if (i==2){

			System.out.println("congrants you got Mobile");
			p= new Mobile();
		}
		else if (i==3){

			System.out.println("congrants you got Tshirt");
			p= new Tshirt();

		}else if (i==4){

			System.out.println("congrants you got Bag");
			p= new Bag();
		}
		return p;
	}

}

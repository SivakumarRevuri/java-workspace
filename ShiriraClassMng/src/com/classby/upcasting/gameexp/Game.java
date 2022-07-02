package com.classby.upcasting.gameexp;

import java.util.Random;

public class Game {

	public Prize startGame(){
		Random r= new Random();
		int rn=r.nextInt(3);
		System.out.println(rn);
		Prize p= null;
		if(rn==0){
			p= new Cap();
		}
		else if(rn==1){
			p= new Gun();
		}		if(rn==2){
			p= new Toy();
		}		
		return p;
	}

}

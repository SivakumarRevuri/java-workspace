package com.gamer.example1;

import java.util.Random;

public class Game {
	
	public static void main(String[] args) {

		System.out.println("game start");
		Soldier s= new Soldier();
		s.killAndTake();

		Random r= new Random();
		int i=r.nextInt(2);

		System.out.println(i);

		if (i==0) {
			
			System.out.println("take machinegun and fire");
		}else 

			System.out.println("take bomb throw and blast");
		
		System.out.println("game end");

	}

}

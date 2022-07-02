package com.gamer.example1;

public class Soldier {

	public void killAndTake(){

		Terrorist t= new Terrorist();

		Weapon w= new Weapon();

		if (w instanceof MachineGun) {
			MachineGun mg = (MachineGun) w;
			mg.fire();
		}

		else if ( w instanceof Bomb) {
			Bomb b = (Bomb) w;
			b.throwAndBlast();
		}


	}

}

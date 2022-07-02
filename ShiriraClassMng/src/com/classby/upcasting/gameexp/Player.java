package com.classby.upcasting.gameexp;

public class Player {
	public static void main(String[] args) {
		Game g=new Game();
		System.out.println("game starts");
		Prize p=g.startGame();
		if(p instanceof Gun){
			Gun gn=(Gun)p;
			gn.fire();
		}
		if(p instanceof Cap)
		{
			Cap c= (Cap)p;
			c.takeCap();
		}
		if(p instanceof Toy){
			Toy t= (Toy)p;
			t.play();
		}
	}

}

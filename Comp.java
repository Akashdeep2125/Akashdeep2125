class Heart{

	public void beats()
package com.oopshiding;	{

		System.out.println("Every Human has heart");

	}

}

class Human{

private final Heart heart;

Human(Heart heart){

	this.heart=heart;

}

public void move() 

{

	heart.beats();

	System.out.println("Human needs exercise to keep heart healthy");

}

}

public class HumanComposition {



	public static void main(String[] args) {

		Heart heart = new Heart();

		Human human = new Human(heart);

		human.move();

	}



}

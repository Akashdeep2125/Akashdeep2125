package com.oopshiding;
interface car{
	public void start();
	public void accelerate();
default public void musicplayer()
{
	System.out.println("I'm a musicplayer method");
}
static public void instruction()
{
	System.out.println("Instruction to drive all cars");
}
}
class ferari implements car{

	@Override
	public void start() {
		System.out.println("Button start");
	}

	@Override
	public void accelerate() {
		System.out.println("left side acceleration");
	}
	
}

class maseratti implements car{

	@Override
	public void start() {
		System.out.println("buletooth start");
	}

	@Override
	public void accelerate() {
		System.out.println("right side acceleration");
	}

class ford implements car{

	@Override
	public void start() {
		System.out.println("buletooth start");
	}

	@Override
	public void accelerate() {
		System.out.println("half acceleration");
	}

		class Driver{
			car c;
		
		public Driver(car c) {
		this.c=c;
	}
	public void drive() {
		c.start();
		c.accelerate();
		if(!(c instanceof ferari))
		c.musicplayer();
	}
	
}
}
}
public class InterfaceDemoA {

	public static void main(String[] args) {
		Driver d = new Driver(new ford  ());
		d.drive();
		car.instruction();
		
	}

}

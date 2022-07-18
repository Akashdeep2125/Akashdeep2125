package com.oopshiding;

import java.util.Scanner;

class Collegeseats {
	int seats = 100;
	private static Collegeseats c = null;
	private Collegeseats() {
		
	}
	public static Collegeseats getInstance() {
		if (c==null)
			c = new Collegeseats();
		return c;
	}
	public void reserveseats(int n) {
		if(n>seats) {
			System.out.println(n+" seats not available");
			return;
		}
		if(n<20) {
	seats = seats-n;
	System.out.println(n+" govt seats");
	System.out.println(seats+" are available");
	}
		else {
			seats = seats-n;
			System.out.println(n+" payment seat");
			System.out.println(seats+" are available");
		}
	}
}
class Collegeportal{
	public static void bookseats() {
	Scanner scn = new Scanner(System.in);
	System.out.println("How many seats: ");
	int n = scn.nextInt();
	
	Collegeseats c = Collegeseats.getInstance();
	c.reserveseats(n);
}
	public static void main(String[] args) {
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
		Collegeportal.bookseats();
	}

}

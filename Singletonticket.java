package com.oopshiding;

import java.util.Scanner;

class Theatre 
{
	int seats = 50;
	private static Theatre t = null;
	
	private Theatre() 
	{
		
	}
	
	public static Theatre getInstance() {
		if(t==null) t = new Theatre();
		return t;
	}
public void reserveseats(int n) {
	if(n>seats) {
		System.out.println(n+" seats not available");
		return;
	}
seats = seats-n;
System.out.println(n+" are reserved");
System.out.println(seats+" are available");
}
}

class Bookmyshow{
	public static void bookseats() {
	Scanner scn = new Scanner(System.in);
	System.out.println("How many seats: ");
	int n = scn.nextInt();
	
	Theatre t = Theatre.getInstance();
	t.reserveseats(n);
}
}
public class Singletonticket {

	public static void main(String[] args) {
		Bookmyshow.bookseats();
		Bookmyshow.bookseats();
		Bookmyshow.bookseats();
		Bookmyshow.bookseats();
	}

}

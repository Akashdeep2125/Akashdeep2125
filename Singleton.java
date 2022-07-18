package com.oopshiding;

class Test1 
	{
		
		private static Test1 m = null;
		public Test1()
		{
			
		}
		public static Test1 getInstance() 
		{ 
			if (m==null)
			m = new Test1();
			return m;
		}
		public void display() 
		{
			System.out.println();
		}
	}
public class Singleton {
	public static void main(String[] args) {
		Test1 t1 = Test1.getInstance();
		Test1 t2 = Test1.getInstance();
		Test1 t3 = Test1.getInstance();
		
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t3==t1);
	}

}


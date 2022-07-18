package com.oopshiding;



	class Test 
	{
		int i;
		public Test(int i)
		{
			this.i=i;
		}
		public static Test getInstance() 
		{ 
			 //factory method
			return new Test(67);
		}
		public void display() 
		{
			System.out.println(this.i);
		}
	}	
	public class Constructor {
	public static void main(String[] args) {
		Test t = new Test(100);
		t.display();
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();
		
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t3==t1);
	}

}

package com.gentech.encapsulations;
class Maths
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result :"+res);
	}
}
public class BeforeSingletonDesignPatternDemo {
	public static void main(String[] args) {
		Maths o1=new Maths();
		o1.addition(10, 20);
		o1.multiplication(5, 10);
		
		Maths o2=new Maths();
		o2.addition(25, 75);
		o2.multiplication(12, 15);
		
		Maths o3=new Maths();
		o3.addition(100, 350);
		o3.multiplication(20, 25);
	}

}

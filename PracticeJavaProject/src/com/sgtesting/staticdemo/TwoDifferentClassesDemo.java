package com.sgtesting.staticdemo;
class Demo1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
}

class Demo2
{
	void multiplication(int x,int y)
	{
		Demo1 o=new Demo1();
		o.addition(10, 60);
		int res=(x*y);
		System.out.println("Multiplication Result :"+res);
	}
}
public class TwoDifferentClassesDemo {
	public static void main(String[] args) {
		Demo2 o=new Demo2();
		o.multiplication(100, 50);
	}
}

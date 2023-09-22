package com.sgtesting.staticdemo;
class Demo3
{
	static
	{
		System.out.println("It is a First static block !!!");
	}
	static
	{
		System.out.println("It is a second static block !!!");
	}
	static
	{
		System.out.println("It is a Third static block !!!");
	}
}
public class StaticDemo3 {
	public static void main(String[] args) {
		Demo3 o=new Demo3();

	}

}

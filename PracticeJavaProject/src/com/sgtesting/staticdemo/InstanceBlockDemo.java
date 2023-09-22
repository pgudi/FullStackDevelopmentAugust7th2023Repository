package com.sgtesting.staticdemo;
class Test
{
	Test()
	{
		System.out.println("It is a Constructor!!!");
	}
	
	{
		System.out.println("It is an instance block!!!");
	}
	
	static 
	{
		System.out.println("It is a static block!!");
	}
}
public class InstanceBlockDemo {
	public static void main(String[] args) {
		Test o=new Test();

	}

}

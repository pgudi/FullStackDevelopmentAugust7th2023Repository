package com.sgtesting.inheritance;
class AA
{
	AA()
	{
		System.out.println("It is AA's class constructor");
	}
}
class BB extends AA
{
	BB()
	{
		super();
		System.out.println("It is BB's class constructor");
	}
}
class CC extends BB
{
	CC()
	{
		super();
		System.out.println("It is CC's class constructor");	
	}
}
public class InheritanceDemo2 {
	public static void main(String[] args) {
		CC o=new CC();
	}
}

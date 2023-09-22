package com.sgtesting.returndemo;
class Maths1
{
	void show(byte a)
	{
		System.out.println("byte a :"+a);
	}
	void show(short s)
	{
		System.out.println("short s :"+s);
	}
	void show(int a)
	{
		System.out.println("int a :"+a);
	}
	void show(long b)
	{
		System.out.println("long b :"+b);
	}
}
public class MethodOverloadingDemo1 {
	public static void main(String[] args) {
		Maths1 o=new Maths1();
		o.show(25);
		o.show((long) 20);
		o.show((short) 15);
		o.show((byte) 10);
	}

}

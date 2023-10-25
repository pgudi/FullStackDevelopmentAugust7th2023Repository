package com.gentech.utildemo;

public class WrapperClassDemo {
	public static void main(String[] args) {
	//	autoBoxingDemo();
		unBoxingDemo();
	}
	
	private static void autoBoxingDemo()
	{
		int a=25;
		System.out.println("int a :"+a);
		//Convert to Wrapper class object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//AutoBoxing
		Integer c=a;
		System.out.println("Integer c:"+c);
	}
	
	private static void unBoxingDemo()
	{
		Integer a=Integer.valueOf(125);
		System.out.println("Integer a:"+a);
		//Convert Wrapper object into Primitive
		int b=a.intValue();
		System.out.println("int b:"+b);
		//Unboxing
		int c=a;
		System.out.println("int c:"+c);
	}

}

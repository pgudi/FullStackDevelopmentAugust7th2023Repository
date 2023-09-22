package com.sgtesting.staticdemo;
class Maths
{
	static String mathsType;
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
}
public class StaticDemo1 {
	public static void main(String[] args) {
		Maths.mathsType="Algebra";
		System.out.println("Maths Type :"+Maths.mathsType);
		Maths.addition(20, 50);

	}

}

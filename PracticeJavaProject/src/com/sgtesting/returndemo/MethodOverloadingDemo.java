package com.sgtesting.returndemo;
class Maths
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	void addition(int a,int b,int c)
	{
		int res=(a+b+c);
		System.out.println("Addition Result:"+res);
	}
	void addition(int a,int b,int c,int d)
	{
		int res=(a+b+c+d);
		System.out.println("Addition Result:"+res);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Maths o=new Maths();
		o.addition(10, 5);
		o.addition(10, 20, 30);
		o.addition(10, 20, 30, 40);
	}

}

package com.sgtesting.returndemo;
class Calculation2
{
	static int div(int x,int y)
	{
		return (x/y);
	}
	int add(int x,int y)
	{
		return (x+y);
	}
	
	int sub1(int x,int y)
	{
		int res=(x-y);
		return res;
	}
	
	void multiplication()
	{
		int a=this.add(12, 5);
		int b=this.sub1(10, 5);
		int c=div(25, 5);
		int res=(a*b);
		System.out.println("Multiplication Result :"+res);
	}
}
public class CalculationDemo2 {
	public static void main(String[] args) {
		Calculation2 o=new Calculation2();
		o.multiplication();

	}

}

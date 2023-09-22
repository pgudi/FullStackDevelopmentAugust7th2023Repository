package com.sgtesting.returndemo;
class Calculation1
{
	int add(int x,int y)
	{
		return (x+y);
	}
	
	int sub1(int x,int y)
	{
		int res=(x-y);
		return res;
	}
	
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("Multiplication Result :"+result);
	}
}
public class CalculationDemo1 {
	public static void main(String[] args) {
		Calculation1 o=new Calculation1();
		int a=o.add(10, 5);
		int b=o.sub1(25, 15);
		o.multiplication(a, b);
		System.out.println("++++++++++++++");
		o.multiplication(o.add(25, 5), o.sub1(100, 90));

	}

}

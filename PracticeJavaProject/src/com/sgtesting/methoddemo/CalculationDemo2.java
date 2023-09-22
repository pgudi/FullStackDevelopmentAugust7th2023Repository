package com.sgtesting.methoddemo;
class Calculation2
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("Multiplication Result :"+result);
	}
}
public class CalculationDemo2 {
	public static void main(String[] args) {
		Calculation2 o=new Calculation2();
		o.addition(10, 30);
		o.multiplication(15, 12);
		o.addition(100, 200);
		o.multiplication(5, 19);
	}

}

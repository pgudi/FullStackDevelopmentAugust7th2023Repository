package com.sgtesting.methoddemo;
class Calculation1
{
	void addition()
	{
		int x,y,res;
		x=20;y=50;
		res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	
	void multiplication()
	{
		int a,b,res;
		a=12;b=10;
		res=(a*b);
		System.out.println("Multiplication Result :"+res);
	}
}
public class CalculationDemo1 {
	public static void main(String[] args) {
		Calculation1 o1=new Calculation1();
		o1.addition();
		o1.multiplication();
		
		Calculation1 o2=new Calculation1();
		o2.addition();
		o2.multiplication();
	}

}

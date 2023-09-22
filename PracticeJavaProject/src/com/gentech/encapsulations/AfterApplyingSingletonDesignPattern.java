package com.gentech.encapsulations;
class Maths1
{
	static Maths1 obj=null;
	private Maths1()
	{
		// It is Private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result :"+res);
	}
	
	public static Maths1 getInstance()
	{
		if(obj==null)
		{
			obj=new Maths1();
		}
		return obj;
	}
}
public class AfterApplyingSingletonDesignPattern {
	public static void main(String[] args) {
		Maths1 o1=Maths1.getInstance();
		o1.addition(10, 20);
		o1.multiplication(5, 10);
		
		Maths1 o2=Maths1.getInstance();
		o2.addition(25, 75);
		o2.multiplication(12, 15);
		
		Maths1 o3=Maths1.getInstance();
		o3.addition(100, 350);
		o3.multiplication(20, 25);

		if (o1==o2 && o2==o3)
		{
			System.out.println("Achieved Singleton desgin pattern");
		}
		else
		{
			System.out.println("Not Achieved Singleton desgin pattern");
		}
	}

}

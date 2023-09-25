package com.gentech.encapsulations;
class Maths2
{
	static Maths2 obj=null;
	private Maths2()
	{
		// private constructor
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
	
	public static Maths2 getInstance()
	{
		if(obj==null)
		{
			obj=new Maths2();
		}
		return obj;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		Maths2 o1=Maths2.getInstance();
		o1.addition(10, 20);
		o1.multiplication(5, 10);
		
		Maths2 o2=Maths2.getInstance();
		o2.addition(25, 75);
		o2.multiplication(12, 15);
		
		Maths2 o3=Maths2.getInstance();
		o3.addition(100, 350);
		o3.multiplication(20, 25);

		if(o1==o2 && o2==o3)
		{
			System.out.println("It is Singleton");
		}
		else
		{
			System.out.println("It is not Singleton");
		}
	}

}

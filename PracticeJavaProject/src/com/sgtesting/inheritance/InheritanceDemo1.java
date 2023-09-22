package com.sgtesting.inheritance;
class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class Maths2 extends Maths1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class Maths3 extends Maths2
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}

class Maths4 extends Maths1
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}
public class InheritanceDemo1 {
	public static void main(String[] args) {
			
		Maths3 o2=new Maths3();
		o2.division(25, 5);
		o2.addition(100, 400);
		o2.substraction(100, 50);
		
		Maths4 o3=new Maths4();
		o3.multiplication(100, 10);
		o3.addition(150, 450);

	}

}

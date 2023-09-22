package com.sgtesting.methoddemo;
class Demo
{
	void findFactorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
public class SampleDemo {

	public static void main(String[] args) {
		Demo o=new Demo();
		o.findFactorial(4);
		o.findFactorial(6);
		o.findFactorial(5);
	}

}

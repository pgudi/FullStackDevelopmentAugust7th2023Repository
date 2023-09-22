package com.sgtesting.returndemo;
class CallByValue
{
	void calculate(int x,int y)
	{
		x+=100;
		y*=12;
		System.out.println("the value of x in method :"+x);
		System.out.println("the value of y in method :"+y);
	}
}
public class CallByValueDemo {
	public static void main(String[] args) {
		int x,y;
		x=10;y=5;
		System.out.println("the value of x :"+x);
		System.out.println("the value of y :"+y);
		CallByValue o=new CallByValue();
		o.calculate(x, y);
		System.out.println("After method execution, x value :"+x);
		System.out.println("After method execution, y value :"+y);
	}

}

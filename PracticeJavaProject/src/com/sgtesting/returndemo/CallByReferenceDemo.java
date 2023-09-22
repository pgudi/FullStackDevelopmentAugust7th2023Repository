package com.sgtesting.returndemo;
class CallByReference
{
	int x,y;
	void calculate(CallByReference o)
	{
		o.x+=100;
		o.y*=12;
		System.out.println("In Method, Value of x :"+o.x);
		System.out.println("In method, Value of y :"+o.y);
	}
	
}
public class CallByReferenceDemo {
	public static void main(String[] args) {
		CallByReference o=new CallByReference();
		o.x=10;
		o.y=5;
		System.out.println("The value of x :"+o.x);
		System.out.println("The value of y :"+o.y);
		o.calculate(o);
		System.out.println("Afte Method Execution,Value of x:"+o.x);
		System.out.println("After Method Execution, Value of y:"+o.y);
		
	}

}

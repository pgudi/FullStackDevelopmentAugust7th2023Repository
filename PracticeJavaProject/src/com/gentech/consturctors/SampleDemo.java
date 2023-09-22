package com.gentech.consturctors;
class BasicMaths
{
	BasicMaths(int x,int y,String action)
	{
		int res;
		switch(action)
		{
		case "add":
			res=(x+y);
			System.out.println("Addition Result :"+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("Substraction Result :"+res);
			break;
		case "mult":
			res=(x*y);
			System.out.println("Multiplication Result :"+res);
			break;
		case "mod":
			res=(x%y);
			System.out.println("Modulus Result :"+res);
			break;
		case "div":
			res=(x/y);
			System.out.println("Division Result :"+res);
			break;
		}
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		BasicMaths o1=new BasicMaths(30,10,"add");
		BasicMaths o2=new BasicMaths(30,10,"sub");
		BasicMaths o3=new BasicMaths(30,10,"div");
		BasicMaths o4=new BasicMaths(30,10,"mult");
		BasicMaths o5=new BasicMaths(30,10,"mod");
	}

}

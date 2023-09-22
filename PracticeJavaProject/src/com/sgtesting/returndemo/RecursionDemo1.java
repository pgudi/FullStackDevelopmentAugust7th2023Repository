package com.sgtesting.returndemo;
class NumbersDemo
{
	static int count=1;
	static int sum=0;
	static int display()
	{
		if(count<=10)
		{
			sum=sum+count;
			count+=1;
			display();
		}
		return sum;
	}
	
//	static void showCount()
//	{
//		System.out.println(sum);
//	}
}
public class RecursionDemo1 {
	public static void main(String[] args) {
		NumbersDemo.display();
//		NumbersDemo.showCount();

	}

}

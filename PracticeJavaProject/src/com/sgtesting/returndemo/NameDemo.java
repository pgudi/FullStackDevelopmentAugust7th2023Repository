package com.sgtesting.returndemo;
class Demo1
{
	void isPrime1(int num)
	{
		
		int flag=0;
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=flag+1;
					break;
				}
			}
			if(flag==0)
				System.out.println(num+" is a Prime Number");
			else
				System.out.println(num+" is not a Prime Number");
		}
		
	}
	
	boolean isPrime2(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
			return true;
		else
			return false;
	}
}
public class NameDemo {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		o.isPrime1(23);

		boolean v1=o.isPrime2(13);
		System.out.println(v1);
		//display prime numbers in between 10 to 50
		for(int i=10;i<=50;i++)
		{
			if(o.isPrime2(i)==true)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		//display prime numbers from 100 to 50 in reverse
		for(int i=100;i>=50;i--)
		{
			if(o.isPrime2(i)==true)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		//find sum of all prime numbers in between 1 to 100
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(o.isPrime2(i)==true)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of Prime numbers from 1 to 100 :"+sum);
		//find count of Prime numbers in between 100 to 200
		System.out.println();
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(o.isPrime2(i)==true)
			{
				count=count+1;
			}
		}
		System.out.println("Count of Prime numbers from 100 to 200 :"+count);
	}

}

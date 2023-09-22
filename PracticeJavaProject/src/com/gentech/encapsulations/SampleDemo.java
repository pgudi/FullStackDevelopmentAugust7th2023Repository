package com.gentech.encapsulations;
class Sample
{
	static boolean isPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	
	static int getPrimeNumberSum(int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)==true)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class SampleDemo {

	public static void main(String[] args) {
		
		int sumResult=Sample.getPrimeNumberSum(1, 50);
		System.out.println(sumResult);
		

	}

}

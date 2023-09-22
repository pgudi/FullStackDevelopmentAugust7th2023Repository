package com.gentech.arraysdemo;
public class OddNumbersDemo {
	public static void main(String[] args) {
		int count=0;
		for(int i=11;i<=31;i++)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
		System.out.println("# of Elements :"+count);
		
		//declare an array
		int x[]=new int[count];
		//assign elements into an array
		int k=0;
		for(int j=11;j<=31;j++)
		{
			if(j%2==1)
			{
				x[k]=j;
				k++;
			}
		}
		//read Elements in reverse
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}

}

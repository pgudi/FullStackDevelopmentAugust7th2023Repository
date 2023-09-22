package com.gentech.loops;

public class EvenNumberCount {
	public static void main(String[] args) {
		int count=0;
		for(int i=10;i<=40;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		System.out.println("# of Even Count :"+count);
	}

}

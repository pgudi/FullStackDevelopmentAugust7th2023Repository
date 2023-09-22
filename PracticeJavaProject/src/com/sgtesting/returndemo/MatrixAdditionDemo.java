package com.sgtesting.returndemo;
class Demo2
{
	void matrixAddition1(int x[][],int y[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				int res=x[i][j]+y[i][j];
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
	
	int[][] matrixAddition2(int x[][],int y[][])
	{
		int z[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
}
public class MatrixAdditionDemo {
	public static void main(String[] args) {
		Demo2 o=new Demo2();
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{10,20,30},{40,50,60}};
		o.matrixAddition1(a, b);
		System.out.println("++++++++++++");
		int a1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b1[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int c[][]=o.matrixAddition2(a1, b1);
		
		//read all rows and all columns Elements
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++++++");
		// Transpose the Return Array
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++");
		//Read 1st Row of the Elements
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[0][i]);
		}
	}

}

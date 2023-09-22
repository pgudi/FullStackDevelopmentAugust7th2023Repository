package com.gentech.arraysdemo;

public class MatrixAdditionDemo2 {

	public static void main(String[] args) {
		int x[][]= {{1,2},{3,4}};
		int y[][]= {{10,20},{30,40}};
		
		if((x.length==y.length) && (x[0].length==y[0].length))
		{
			int z[][]=new int[x.length][x[0].length];
			
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]+y[i][j];
				}
			}
			
			//Read Elements from z array
			for(int m=0;m<z.length;m++)
			{
				for(int n=0;n<z[m].length;n++)
				{
					System.out.print(z[m][n]+"  ");
				}
				System.out.println();
			}
		}
		
		

	}

}

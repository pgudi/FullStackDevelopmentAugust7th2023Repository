package com.gentech.arraysdemo;

public class MatrixAdditionDemo {

	public static void main(String[] args) {
		
		int x[][]= {{1,2},{3,4}};
		int y[][]= {{10,20},{30,40}};
		
		if((x.length==y.length) && (x[0].length==y[0].length))
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

	}

}

package com.gentech.arraysdemo;
public class TwoDimensitionalArrayDemo {
	public static void main(String[] args) {
		
		//Declare 2D array
		int x[][]={{10,20,30},{40,50,60},{70,80,90}};
		//Read Elements
		for(int a[]:x)
		{
			for(int v1:a)
			{
				System.out.print(v1+"  ");
			}
			System.out.println();
		}
		
	}

}

package com.gentech.programs;

public class StudentGradeDemo {
	public static void main(String[] args) {
		//24
		int marks=Integer.parseInt(args[0]);
		if((marks>=70) && (marks<=100))
		{
			System.out.println("Result is FCD");
		}
		else if((marks<70) && (marks>=60))
		{
			System.out.println("Result is First Class");
		}
		else if((marks<60) && (marks>=50))
		{
			System.out.println("Result is Second Class");
		}
		else if((marks<50) && (marks>=35))
		{
			System.out.println("Result is Pass Class");
		}
		else if((marks<35) && (marks>=0))
		{
			System.out.println("Result has failed!!!");
		}
		else
		{
			System.out.println("Invalid Marks!!!");
		}

	}

}

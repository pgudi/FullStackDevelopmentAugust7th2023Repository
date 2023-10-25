package com.sgtesting.stringdemo;
class Student
{
	String firstName;
	int rollNo;
	Student(String fn,int rollNo)
	{
		firstName=fn;
		this.rollNo=rollNo;
	}
	
	@Override
	public String toString()
	{
		return "First Name of the Student :"+firstName+" and Roll Number is :"+rollNo;
	}
}
public class StringDemo2 {
	public static void main(String[] args) {
		Student obj=new Student("Santosh",11);
		
		System.out.println(obj);

	}
}

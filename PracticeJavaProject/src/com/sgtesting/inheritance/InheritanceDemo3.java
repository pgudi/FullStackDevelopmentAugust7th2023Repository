package com.sgtesting.inheritance;
class Student
{
	Student(String firstName,int RollNo)
	{
		System.out.println("First Name :"+firstName);
		System.out.println("Roll Number :"+RollNo);
	}
}
class Library extends Student
{
	String bookName;
	Library(String fn,int rollNo,String bookName)
	{
		super(fn,rollNo);
		this.bookName=bookName;
		System.out.println("Book Name :"+bookName);
	}
}
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Library o=new Library("Santosh",101,"Core Java");
		Library o2=new Library("Richard",102,"Python");
	}
}

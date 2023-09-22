package com.sgtesting.staticdemo;
class Student
{
	static String firstName;
	static int age;
	static
	{
		firstName="Santosh";
		showFirstName();
		showAge();
	}
	
	static void showFirstName()
	{
		System.out.println("First Name :"+firstName);
	}
	
	static void showAge()
	{
		System.out.println("Age of the Student :"+age);
	}
}
public class StaticDemo2 {
	public static void main(String[] args) {
		Student.age=15;
		System.out.println("In Main Method, age value:"+Student.age);

	}

}

package com.gentech.parametrizedconstructor;
class Student
{
	String firstName;
	int age;
	
	Student(String firstName,int age)
	{
		this.firstName=firstName;
		this.age=age;
		System.out.println("First Name:"+firstName);
		System.out.println("Age :"+age);
		System.out.println("+++++++++++++");
	}
	
	void display()
	{
		System.out.println("First Name:"+firstName);
		System.out.println("Age :"+age);
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student obj=new Student("Santosh",21);
		obj.display();
	}

}

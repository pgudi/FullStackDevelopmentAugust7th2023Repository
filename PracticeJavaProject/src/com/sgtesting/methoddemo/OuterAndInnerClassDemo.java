package com.sgtesting.methoddemo;
class Outer
{
	String firstName;
	Inner o=new Inner();
	void showAge()
	{
		o.age=21;
		System.out.println("Age :"+o.age);
	}
	class Inner
	{
		int age;
		void showFirstName()
		{
			firstName="Santosh";
			System.out.println("First Name :"+firstName);
		}
	}
}
public class OuterAndInnerClassDemo {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.showAge();
		outer.o.showFirstName();

	}

}

package com.sgtesting.abstractdemo;
abstract class College
{
	abstract void showCollegeName(String name);
	abstract void displayCollegeLocation(String loc);
	void showCourses(String course[])
	{
		for(int i=0;i<course.length;i++)
		{
			System.out.println("Course Name :"+course[i]);
		}
	}
}
class EngineeringCollege extends College
{
	void showCollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
	
	void displayCollegeLocation(String loc)
	{
		System.out.println("Location of the College:"+loc);
	}
	
	void showAddress(String address)
	{
		System.out.println("Address of the College :"+address);
	}
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		College o=new EngineeringCollege();
		o.showCollegeName("SLN Engineering College");
		o.displayCollegeLocation("Attiguppe");
	//	o.showAddress("1st Main,2nd Stage,Attiguppe Metro");  can't access
		String s[]= {"CSE","EEE","Civil","Mech","ISE"};
		o.showCourses(s);
	}

}

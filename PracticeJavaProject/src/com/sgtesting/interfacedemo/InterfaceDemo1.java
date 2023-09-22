package com.sgtesting.interfacedemo;
interface University
{
	void showUniversityName(String name);
}

interface College 
{
	abstract void displayCollegeName(String name);
}

class SLNEngineeringCollege implements University,College
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void displayCollegeName(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
	
	void showAddress(String address)
	{
		System.out.println("Address of the University :"+address);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		University o=new SLNEngineeringCollege();
		o.showUniversityName("VTU Belguam");
	//	o.displayCollegeName("SLN Engineering College");   can't access
	//	o.showAddress("1st Main,15th cross,First Pahse Belguam");   can't access
	}

}

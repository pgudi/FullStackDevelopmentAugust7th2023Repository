package com.sgtesting.inheritance;
class DemoLocation1
{
	void showCityName(String cityName)
	{
		System.out.println("The City Name in Parent Class :"+cityName);
	}
}

class DemoPlace2 extends DemoLocation1
{
	DemoPlace2(String name)
	{
		super.showCityName(name);
	}
	void showCityName(String cityName)
	{
		System.out.println("The City Name in Child Class :"+cityName);
	}
}
public class SameMethodsDemo {
	public static void main(String[] args) {
		DemoPlace2 o=new DemoPlace2("Dallas");
		o.showCityName("Bangalore");

	}

}

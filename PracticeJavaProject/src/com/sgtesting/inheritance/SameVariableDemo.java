package com.sgtesting.inheritance;
class Country
{
	String stateName;
	void show()
	{
		System.out.println("State Name in super class :"+stateName);
	}
}
class IslandCountry extends Country
{
	IslandCountry(String name)
	{
		super.stateName=name;
		
	}
	String stateName;
	void display()
	{
		System.out.println("State Name in sub class :"+stateName);
	}
}
public class SameVariableDemo {
	public static void main(String[] args) {
		IslandCountry o=new IslandCountry("Karantaka");
		o.stateName="Kerala";
		o.show();
		o.display();
		

	}

}

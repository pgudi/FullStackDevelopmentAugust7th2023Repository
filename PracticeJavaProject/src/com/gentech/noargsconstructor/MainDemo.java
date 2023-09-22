package com.gentech.noargsconstructor;
class Person1
{
	String firstName;
	int age;
	Person1()
	{
		firstName="Santosh";
		age=21;
		System.out.println("First Name :"+firstName);
		System.out.println("Age :"+age);
		System.out.println("++++++++");
	}
}

class Birds
{
	String featherColor;
	int noofwings;
	Birds()
	{
		featherColor="Gray Color";
		noofwings=2;
		System.out.println("Feather Color :"+featherColor);
		System.out.println("No of Wings :"+noofwings);
		System.out.println("++++++++");
	}
}

class DomesticAnimal
{
	String quantityOfMilkProvides;
	String breedName;
	DomesticAnimal()
	{
		quantityOfMilkProvides="10 Liters";
		breedName="Jersey";
		System.out.println("Quantity of Milk Provides :"+quantityOfMilkProvides);
		System.out.println("Breed Name :"+breedName);
	}
}
public class MainDemo {
	public static void main(String[] args) {
		Person1 santu=new Person1();
		
		Person1 obj1=new Person1();
		
		Person1 obj2=new Person1();
		
		Person1 obj3=new Person1();
		
	}

}

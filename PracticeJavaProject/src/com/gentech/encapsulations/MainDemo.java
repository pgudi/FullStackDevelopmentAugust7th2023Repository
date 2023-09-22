package com.gentech.encapsulations;
class Person1
{
	String firstName;
	int age;
	
}

class Birds
{
	String featherColor;
	int noofwings;
}

class DomesticAnimal
{
	String quantityOfMilkProvides;
	String breedName;
}
public class MainDemo {
	public static void main(String[] args) {
		Person1 santu=new Person1();
		santu.firstName="Santosh";
		santu.age=21;
		System.out.println("First Name :"+santu.firstName);
		System.out.println("Age :"+santu.age);
		System.out.println("++++++++");
		Birds sparrow=new Birds();
		sparrow.featherColor="Gray Color";
		sparrow.noofwings=2;
		System.out.println("Feather Color :"+sparrow.featherColor);
		System.out.println("No of Wings :"+sparrow.noofwings);
		System.out.println("++++++++");
		DomesticAnimal cow=new DomesticAnimal();
		cow.quantityOfMilkProvides="10 Liters";
		cow.breedName="Jersey";
		System.out.println("Quantity of Milk Provides :"+cow.quantityOfMilkProvides);
		System.out.println("Breed Name :"+cow.breedName);
	}

}

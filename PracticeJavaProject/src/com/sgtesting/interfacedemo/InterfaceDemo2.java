package com.sgtesting.interfacedemo;
interface Product
{
	void showProductName(String name);
	default void showProductPrice(double price)
	{
		System.out.println("Price of the Product :"+price);
	}
}

interface Order
{
	default void showProductPrice(double price)
	{
		System.out.println("Price of the Product as per Order:"+price);
	}
}

class Acer implements Product,Order
{
	public void showProductName(String name)
	{
		System.out.println("Product Name :"+name);
	}
	@Override
	public void showProductPrice(double price)
	{
		System.out.println("Price of the Product as per Order and Productwise:"+price);
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Acer obj=new Acer();
		obj.showProductName("ACER Monitor");
		obj.showProductPrice(450.74);
	}

}

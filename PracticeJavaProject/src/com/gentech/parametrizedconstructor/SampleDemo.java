package com.gentech.parametrizedconstructor;
class Customers
{
	Customers(String customerName)
	{
		System.out.println("Customer Name :"+customerName);
	}
	
	Customers(int customerId)
	{
		this("Adams");
		System.out.println("Customer Id :"+customerId);
	}
	
	Customers()
	{
		System.out.println("It is No-Args Constructor");
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		Customers obj=new Customers(111);
	}

}

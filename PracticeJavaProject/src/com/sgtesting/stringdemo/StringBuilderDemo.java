package com.sgtesting.stringdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseDemo();
	}

	private static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("+++++++++++++++++++");
	}
	
	private static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a book");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("+++++++++++++++++++");
	}
	
	private static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		StringBuilder s1=s.delete(8, 12);
		System.out.println("Deelted String :"+s1);
		System.out.println("+++++++++++++++++++");
	}
	
	private static void reverseDemo()
	{
		StringBuilder s=new StringBuilder("Welcome to Core Java");
		System.out.println("Reversd String :"+s.reverse());
		System.out.println("+++++++++++++++++++");
	}
}

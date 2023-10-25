package com.sgtesting.stringdemo;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseDemo();
		
	}
	
	private static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println(s);
		s.append(" Core Java");
		System.out.println(s);
		System.out.println("++++++++++++++++++++");
	}

	private static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a book");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("++++++++++++++++++++");
	}
	
	private static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new book");
		StringBuffer s1=s.delete(8, 12);
		System.out.println("Deleted Result :"+s1);
		System.out.println("++++++++++++++++++++");
	}
	
	private static void reverseDemo()
	{
		StringBuffer s=new StringBuffer("Programming");
		System.out.println("Reverse String :"+s.reverse());
		System.out.println("++++++++++++++++++++");
	}
}

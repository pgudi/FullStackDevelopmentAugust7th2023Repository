package com.gentech.utildemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add(0,"Grapes");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("White");
		obj1.add("Blue");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements2()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElementsByIterator()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void withoutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(75);
		obj.add("Mango");
		obj.add(100.75);
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}

}

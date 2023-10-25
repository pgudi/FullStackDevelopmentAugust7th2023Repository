package com.gentech.utildemo;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements();
	//	readByIterator();
	//	convertHashSetInToArray();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("White");
		obj1.add("Green");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add("Water melon");
		obj.add("Orange");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}

	private static void readElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add("Water melon");
		obj.add("Orange");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readByIterator()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add("Water melon");
		obj.add("Orange");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void convertHashSetInToArray()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add("Water melon");
		obj.add("Orange");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		Object[] a=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].toString());
		}
	}
	
	private static void withoutGenerics()
	{
		HashSet obj=new HashSet();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(75);
		obj.add("Mango");
		obj.add(100.75);
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}
}

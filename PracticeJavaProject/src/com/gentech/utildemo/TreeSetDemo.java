package com.gentech.utildemo;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements();
	//	readByIterator();
		convertTreeSetInToArray();
	}
	
	private static void addElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(400);
		obj.add(300);
		obj.add(600);
		obj.add(800);
		obj.add(100);
		System.out.println("Elements :"+obj);
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.add(125);
		obj1.add(550);
		obj1.add(770);
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(400);
		obj.add(300);
		obj.add(600);
		obj.add(800);
		obj.add(100);
		System.out.println("Elements :"+obj);
		obj.remove(300);
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(400);
		obj.add(300);
		obj.add(600);
		obj.add(800);
		obj.add(100);
		System.out.println("Elements :"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	
	private static void readByIterator()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(400);
		obj.add(300);
		obj.add(600);
		obj.add(800);
		obj.add(100);
		System.out.println("Elements :"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void convertTreeSetInToArray()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(400);
		obj.add(300);
		obj.add(600);
		obj.add(800);
		obj.add(100);
		System.out.println("Elements :"+obj);
		Object a[]=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}

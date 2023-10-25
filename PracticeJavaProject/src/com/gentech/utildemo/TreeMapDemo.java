package com.gentech.utildemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	//	addElements();
	//	readRemoveElements();
		readElements();
	}
	
	private static void addElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		System.out.println("Elements :"+obj);
	}

	private static void readRemoveElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		System.out.println("Elements :"+obj);
		String v1=obj.get("lotus");
		System.out.println(v1);
		String v2=obj.remove("lotus");
		System.out.println(v2);
		String v3=obj.get("lotus");
		System.out.println(v3);
	}
	
	private static void readElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		System.out.println("Elements :"+obj);
		obj.forEach((k,v) -> System.out.println(k+" --> "+v));
	}
}

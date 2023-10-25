package com.gentech.utildemo;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
	//	addElements();
	//	readRemoveElements();
	//	readElements();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		obj.put(null, "HashMap object supports Null Keys");
		System.out.println("Elements :"+obj);
	}
	
	private static void readRemoveElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		obj.put(null, "HashMap object supports Null Keys");
		System.out.println("Elements :"+obj);
		String v1=obj.get("mango");
		System.out.println(v1);
		String v2=obj.remove("mango");
		System.out.println(v2);
		String v3=obj.get("mango");
		System.out.println(v3);
	}

	private static void readElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("camel", "Camel is a ship of the desrt");
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("tiger", "Tiger is a national animal of India");
		obj.put("raichur", "Raichur is a palace city and clean city of Karnataka");
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("bangalore", "Bangalore is a garden city of Karnataka");
		obj.put(null, "HashMap object supports Null Keys");
		System.out.println("Elements :"+obj);
		obj.forEach((k,v) -> System.out.println(k+" --> "+v));
	}
	
	private static void withoutGenerics()
	{
		HashMap obj=new HashMap();
		System.out.println("Elements :"+obj);
		obj.put(1, "It is First Number");
		obj.put(12.57, "It is double value");
		obj.put("char data type", 'Y');
		obj.put(true, false);
		System.out.println("Elements :"+obj);
	}
}

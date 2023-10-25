package com.gentech.utildemo;
class Sample<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}
public class GenericsDemo {
	public static void main(String[] args) {
		//With Generics
		Sample<Integer> o=new Sample<Integer>();
		o.add(55);
		int a=o.get();
		System.out.println(a);
		//Without Generics
		Sample o1=new Sample();
		o1.add("Mango");
		String s=(String) o1.get();
		System.out.println(s);
		o1.add(12.75);
		double d=(double) o1.get();
		System.out.println(d);
		
	}

}

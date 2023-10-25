package com.gentech.utildemo;
class Sample1
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsElementDemo {
	public static void main(String[] args) {
		Integer a[]= {10,20,30,40};
		Sample1.readElements(a);
		System.out.println("+++++++++++");
		String s[]= {"Apple","Mango","Ornage"};
		Sample1.readElements(s);
		System.out.println("+++++++++++");
		Double d[]= {2.15,5.25,10.55};
		Sample1.readElements(d);
		System.out.println("+++++++++++");
	}

}

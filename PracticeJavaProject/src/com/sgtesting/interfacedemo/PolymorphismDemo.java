package com.sgtesting.interfacedemo;
abstract class GeometricFigure
{
	abstract void area();
}
class Rectangle extends GeometricFigure
{
	void area() {
		int length,breadth;
		length=10;breadth=5;
		System.out.println("Area of Rectangle :"+(length*breadth));
	}
}
class Square extends GeometricFigure
{
	void area()
	{
		int side=9;
		System.out.println("Area of the Square :"+(side * side));
	}
}
class Circle extends GeometricFigure
{
	void area()
	{
		double pi=3.14;
		double r=2.5;
		System.out.println("Area of the Circle :"+(pi * r * r));
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		GeometricFigure figure=null;
		
		Rectangle rect=new Rectangle();
		Square square=new Square();
		Circle circle=new Circle();
		
		figure=rect;
		figure.area();
		
		figure=square;
		figure.area();
		
		figure=circle;
		figure.area();

	}

}

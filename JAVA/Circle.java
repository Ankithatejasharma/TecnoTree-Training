//Circle Class
package com.assg2;

public class Circle {
	
	double radius;
	double diameter;
	double area;
	
	Circle(double radius){
		this.radius=radius;
		this.diameter=2*radius;
		this.area=Math.PI*radius*radius;
		
	}
	public double getArea()
	{
		return area;
	}
	public double getDiameter()
	{
		return diameter;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(8);
		
		double d=circle.getDiameter();
		double a=circle.getArea();
		System.out.println("Area: "+a+" Diameter: "+d);
		

	}

}

//Rectangle Class
package com.assg2;

public class Rectangle {
	
	double length;
	double width;
	double area;
	
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
		this.area=length*width;
		
	}
	public double getArea()
	{
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(4,9);
		
		double area=r.getArea();
		System.out.println("Area : "+area);
		

	}

}

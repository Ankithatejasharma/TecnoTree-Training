//Calculate the area of the triangle
package com.assg2;

public class Triangle {
	double base;
    double height;
    double area;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = 0.5 * base * height;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
        this.area = 0.5 * base * height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
        this.area = 0.5 * base * height;
    }
    
    public double getArea() {
        return area;
    }
    
    public void calculateArea() {
        this.area = 0.5 * base * height;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Triangle triangle = new Triangle(10.0, 28.0);
        
        // change the triangle's height to 5.0
        triangle.setHeight(5.0);
        
        // print out the triangle's base, height, and area
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.getArea());
        
        // recalculate the triangle's area
        triangle.calculateArea();
        
        // print out the triangle's new area
        System.out.println("New area: " + triangle.getArea());

	}

}

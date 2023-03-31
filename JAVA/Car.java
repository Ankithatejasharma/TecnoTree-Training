//Car Class
package com.assg2;

public class Car {
	String make;
	String model;
	int year;
	String color;
	double price;
	
	Car(String make,String model,int year,String color,double price)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
		this.price=price;
	}
	
	public String getMake()      //Getter Make
	{
		return make;
	}
	public void setMake(String Make) //Setter
	{
		this.make=make;
	}
	public String getModel()      
	{
		return model;
	}
	public void setModel(String Model)
	{
		this.model=model;
	}
	public int getYear()     
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public String getColor()      
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public double getPrice()      
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Toyota","5UV",2015,"white",500000); //Creating new class object
		
		String mdl=c.getModel();
		System.out.println(mdl);
		
		c.setColor("Blue");
		String color=c.getColor();
		System.out.println(color);
		
		

	}

}

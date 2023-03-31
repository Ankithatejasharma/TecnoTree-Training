//Student Class
package com.assg2;

public class Student {
	String name;
	int age;
	char gender;
	char grade;
	int gpa;
	
	Student(String name,int age,char gender,char grade,int gpa)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.grade=grade;
		this.gpa=gpa;
	}
	
	public String getName()      //Getter 
	{
		return name;
	}
	public void setName(String name) //Setter
	{
		this.name=name;
	}
	public int getAge()      
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public char gender()     
	{
		return gender;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public char getGrade()      
	{
		return grade;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	public int getGpa()      
	{
		return gpa;
	}
	public void setGpa(int gpa)
	{
		this.gpa=gpa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student("Ankitha",20,'F','7',9); //Creating new class object
		
		String nm=s.getName();
		System.out.println(nm);
		
		s.setGpa(10);
		int gpa=s.getGpa();
		System.out.println(gpa);

	}

}

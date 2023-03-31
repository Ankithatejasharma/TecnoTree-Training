//Interface Concepts
package com.hello;
import java.util.*;
interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	// DemoClass "implements" FirstInterface and SecondInterface

	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
		  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1");
		String str=s.nextLine();
		
	    System.out.println(str);
	  }
	  public void myOtherMethod() {
		  Scanner s=new Scanner(System.in);
			System.out.println("Enter the string2");
			String str2=s.nextLine();
			
		    System.out.println(str2);
	  }
	}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();

	}

}

//Converting Celsius to Fahrenheit 
package com.hello;

import java.util.Scanner;

public class CeltoFrhnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature");
		double a=s.nextInt();
		double toFar=(a*1.8)+32;
		System.out.println("Celsius: "+a+" Fahrenheit: "+toFar);
		

	}

}

//To Check Leap Year
package com.hello;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Year?");
		int a=s.nextInt();
		if((a%4==0 && a%100!=0) || a%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");

	}

}

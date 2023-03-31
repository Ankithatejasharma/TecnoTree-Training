//Check Even or Odd
package com.hello;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");


	}

}

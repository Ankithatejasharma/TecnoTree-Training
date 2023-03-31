//Max of Two Nums
package com.hello;

import java.util.Scanner;

public class MaxofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");

	}

}

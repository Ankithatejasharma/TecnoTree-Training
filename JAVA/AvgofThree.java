//Average of Three Numbers
package com.hello;

import java.util.Scanner;

public class AvgofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("The avverage :"+avg);
	}

}

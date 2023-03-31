//Accessing Array using while loop
package com.assg4;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arry[]=new double[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Array elements : ");
		int i=0;
		while(i<arry.length) {
			arry[i]=s.nextDouble();
			System.out.println(arry[i]);
			i++;
		}

	}

}

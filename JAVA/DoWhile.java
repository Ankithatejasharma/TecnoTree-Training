//Accessing Array using Do-While Loop
package com.assg4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]=new char[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Array elements : ");
		int i=0;
		do {
			a[i]=s.next().charAt(0);
			System.out.println(a[i]);
		}while(i<a.length);

	}

}

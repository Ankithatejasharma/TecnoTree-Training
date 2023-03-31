//Accessing String Array using For Each loop
package com.assg4;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Array elements : ");
		
		for(String elem:a)  {                //For Each Loop
			
				elem=s.next();
				System.out.print(elem+" ");
				
		}
			

	}

}

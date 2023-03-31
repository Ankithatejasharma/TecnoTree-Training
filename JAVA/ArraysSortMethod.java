//Arrays Sort Class
package com.assg4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array : ");
		size=s.nextInt();
		int arry[]=new int[size];
		
		System.out.println("Array Elements: ");
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=s.nextInt();
		}
		Arrays.sort(arry);
		
			System.out.println("The sorted array :"+ Arrays.toString(arry));
		
		


	}

}

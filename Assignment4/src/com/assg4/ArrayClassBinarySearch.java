//Binary Search the index of the string using Array Class
package com.assg4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array : ");
		size=s.nextInt();
		String a[]=new String[size];
		
		System.out.println("Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next();
		}
		Arrays.sort(a);//Should be arranged in ascending order to perform binary search
		
		System.out.println("Enter the desired string to be searched: ");
		String searchString=s.next();
		int binSearch=Arrays.binarySearch(a, searchString);//stores the index in that particular variable
		
			System.out.println("Index of "+searchString+" is "+binSearch);
		

	}

}

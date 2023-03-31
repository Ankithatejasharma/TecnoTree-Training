//Accessing Array Elements
package com.assg4;
import java.util.*;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Array elements : ");
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=s.nextInt();
			System.out.print(arry[i]+" ");
		}

	}

}

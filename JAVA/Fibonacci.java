//Program to print the fibonacci series
package com.hello;
import java.util.*;
public class Fibonacci {
	static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
		
	}

}

//Print the first n prime number
package com.hello;

import java.util.Scanner;

public class Prime {
	
	static boolean isPrime(int n)
	{
		if(n==1||n==0)
			return false;
		
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}

	}

}

//GCD of 2 Numbers
package com.hello;

import java.util.Scanner;

public class GCD {
	static int gcd( int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
        System.out.println("The GCD : "+gcd(a,b));
	}

}

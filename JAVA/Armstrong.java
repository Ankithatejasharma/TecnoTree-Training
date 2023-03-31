//Armstrong Number
package com.hello;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int r,sum=0,temp;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum+=(Math.pow(r,3));
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}

}

//Sum of the digits of given number
package com.hello;

import java.util.Scanner;

public class SumofGivenSequenceofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println(sum);
	}

}

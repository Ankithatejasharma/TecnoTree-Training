//Sum of n natural numbers
package com.hello;

import java.util.Scanner;

public class SumOfnNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        System.out.println("Enter n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	sum+=i;
        	
        }
        System.out.println(sum);
        
	}

}

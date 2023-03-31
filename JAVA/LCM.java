//LCM of 2 numbers
package com.hello;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int lcm=(a>b)?a:b;
		
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println(lcm);
				break;
			}
			++lcm;
		}

	}

}

//StringReplace
package com.assg4;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		System.out.println("Enter the string to be replaced");
		String toBeReplaced=s.nextLine();
		System.out.println("Enter the replacing string");
		String replacing=s.nextLine();
		String finalResult=str.replace(toBeReplaced, replacing);
		System.out.println(finalResult);
		

	}

}

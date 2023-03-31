//StringSplit
package com.assg4;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		String[] substring=str.split(" ");
		System.out.println("Array of substrings :"+Arrays.toString(substring));
		

	}

}

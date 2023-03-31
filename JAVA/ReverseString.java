//Reversing a string
package com.hello;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String newstr="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
        	ch=str.charAt(i);
        	newstr=ch+newstr;
        }
        System.out.println(newstr);
	}

}

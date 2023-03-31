package com.hello;
import java.util.*;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        // Perform arithmetic operations.
        int addition 		= num1 + num2;
        int subtraction 	= num1 - num2;
        int multiplication 	= num1 * num2;
        int division    	= num1 / num2;
        int modulo	        = num1 % num2;
        
        System.out.println("Addition : "         + addition);
        System.out.println("Subtraction : "  + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : "    + division);
        System.out.println("Modulo : "      + modulo);
	}

}

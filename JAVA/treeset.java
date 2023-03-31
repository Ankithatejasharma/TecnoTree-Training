//TreeSet
package com.assg6;
import java.util.*;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            if (numbers.contains(number)) {
                System.out.println(number + " is already in the set.");
            } else {
                numbers.add(number);
                System.out.println(number + " has been added to the set.");
            }

            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter a number to remove:");
            int number = scanner.nextInt();

            if (numbers.contains(number)) {
                numbers.remove(number);
                System.out.println(number + " has been removed from the set.");
            } else {
                System.out.println(number + " is not in the set.");
            }

            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("The set contains the following numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

	}

}

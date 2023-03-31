//ArrayList
package com.assg6;
import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add name");
            System.out.println("2. Remove name");
            System.out.println("3. Display names");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = scanner.next();
                    names.add(nameToAdd);
                    System.out.println("Name added.");
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = scanner.next();
                    if (names.contains(nameToRemove)) {
                        names.remove(nameToRemove);
                        System.out.println("Name removed.");
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;
                case 3:
                    System.out.println("Current list of names:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
		

	}

}

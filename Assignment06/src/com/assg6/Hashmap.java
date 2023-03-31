//HashMap
package com.assg6;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dictionary = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word:");
            String word = scanner.nextLine();

            if (dictionary.containsKey(word)) {
                System.out.println("The meaning of " + word + " is: " + dictionary.get(word));
            } else {
                System.out.println("The word " + word + " is not in the dictionary.");
                System.out.println("Enter the meaning of " + word + ":");
                String meaning = scanner.nextLine();
                dictionary.put(word, meaning);
                System.out.println("The word " + word + " has been added to the dictionary with the meaning: " + meaning);
            }

            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("The dictionary contains the following words and meanings:");
        for (String word : dictionary.keySet()) {
            System.out.println(word + " - " + dictionary.get(word));
        }

	}

}

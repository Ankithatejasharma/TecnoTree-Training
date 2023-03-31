package com.hello;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();

	      // Add some names to the list
	      names.add("Alice");
	      names.add("Bob");
	      names.add("Charlie");
	      names.add("David");

	      // Print the list
	      System.out.println("Names: " + names);

	      // Remove "Charlie" from the list
	      names.remove("Charlie");

	      // Print the modified list
	      System.out.println("Names (after removal): " + names);

	      // Create a HashSet of integers
	      Set<Integer> numbers = new HashSet<>();

	      // Add some numbers to the set
	      numbers.add(10);
	      numbers.add(20);
	      numbers.add(30);
	      numbers.add(40);

	      // Print the set
	      System.out.println("Numbers: " + numbers);

	      // Check if the set contains the number 20
	      if (numbers.contains(20)) {
	         System.out.println("The set contains 20.");
	      } else {
	         System.out.println("The set does not contain 20.");
	      }

	      // Create a TreeMap of String keys and Integer values
	      Map<String, Integer> ages = new TreeMap<>();

	      // Add some ages to the map
	      ages.put("Alice", 25);
	      ages.put("Bob", 30);
	      ages.put("David", 20);

	      // Print the map
	      System.out.println("Ages: " + ages);

	      // Get the age of "Bob" from the map
	      int bobsAge = ages.get("Bob");
	      System.out.println("Bob's age is " + bobsAge);

	}

}

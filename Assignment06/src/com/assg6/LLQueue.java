//Linked List Implementation of a Queue
package com.assg6;
import java.util.*;

public class LLQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("Enter 1 to add an item to the queue");
            System.out.println("Enter 2 to remove an item from the queue");
            System.out.println("Enter 3 to display the current queue");
            System.out.println("Enter 4 to exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add to the queue: ");
                    String item = scanner.nextLine();
                    queue.add(item);
                    System.out.println("Item added to queue");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        String removedItem = queue.remove();
                        System.out.println("Item removed from queue: " + removedItem);
                    }
                    break;
                case 3:
                    System.out.println("Current queue: " + queue);
                    break;
                case 4:
                    System.out.println("Exiting program");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
            System.out.println();
        }
        

	}

}

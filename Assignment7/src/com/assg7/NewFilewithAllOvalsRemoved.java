//Creating a new file with all ovals removed
package com.assg7;
import java.io.*;

public class NewFilewithAllOvalsRemoved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = "C:\\Users\\sharman\\OneDrive - Tecnotree\\Documents\\input.txt";
        String outputFile = "output1.txt";

        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                if (!isVowel(c)) {
                    writer.write(c);
                }
            }

            reader.close();
            writer.close();

            System.out.println("Successfully created file " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
		
        }
        
        
	}
	private static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

//HashSet
package com.assg6;
import java.util.*;
import java.io.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sharman\\OneDrive - Tecnotree\\Documents\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of unique words in the file: " + words.size());
		

	}

}

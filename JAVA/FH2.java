package com.hello;
import java.io.*;

public class FH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Open the file for writing
            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
 
            // Write some text to the file
            bufferedWriter.write("Hello, world!");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a test.");
            bufferedWriter.newLine();
 
            // Close the file
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

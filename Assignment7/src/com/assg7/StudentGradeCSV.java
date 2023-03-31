//Read the student grade and calculate the average of the student grade in the csv file
package com.assg7;
import java.io.*;
import java.util.*;

public class StudentGradeCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Open input and output files
            Scanner input = new Scanner(new File("C:\\Users\\sharman\\OneDrive - Tecnotree\\Documents\\new.csv"));
            PrintWriter output = new PrintWriter(new File("averages.csv"));

            // Read in header line from input file and write to output file
            String header = input.nextLine();
            output.println(header + ",Average");

            // Loop through each line of input file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] fields = line.split(",");

                // Calculate average grade for this student
                double sum = 0;
                int count = 0;
                for (int i = 1; i < fields.length; i++) {
                    sum += Double.parseDouble(fields[i]);
                    count++;
                }
                double average = sum / count;

                // Write line to output file with average grade appended
                output.printf("%s,%.2f\n", line, average);
            }

            // Close input and output files
            input.close();
            output.close();

            System.out.println("Grades processed successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

	}

}

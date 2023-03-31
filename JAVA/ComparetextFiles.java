//Compare the text files
package com.assg7;
import java.io.*;
public class ComparetextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file1 = "C:\\Users\\sharman\\OneDrive - Tecnotree\\Documents\\input.txt";
        String file2 = "C:\\Users\\sharman\\OneDrive - Tecnotree\\Documents\\input1.txt";

        boolean areIdentical = compareFiles(file1, file2);

        if (areIdentical) {
            System.out.println("The files are identical.");
        } else {
            System.out.println("The files are NOT identical.");
        }
    }

    public static boolean compareFiles(String file1, String file2) {

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line1, line2;

            while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    return false;
                }
            }

            if (br1.readLine() != null || br2.readLine() != null) {
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;

	}

}

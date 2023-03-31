//Read a binary files
package com.assg7;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
public class ReadABinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Read in binary file
            File file = new File("C:\\Users\\sharman\\Downloads\\image.bin");
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = fis.readAllBytes();
            fis.close();
            
            // Decode binary data into BufferedImage
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(bytes));
            
            // Display image in JLabel
            JFrame frame = new JFrame("Image Display");
            JLabel label = new JLabel(new ImageIcon(image));
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

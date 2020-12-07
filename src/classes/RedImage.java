/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Taffarel
 */
// Java program to demonstrate colored to red colored image conversion 
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RedImage {

    public static void main(String args[]) throws IOException {
        BufferedImage img = null;
        File f = null;

        // read image 
        try {
            f = new File("cachorro-original.jpg");
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        // get width and height 
        int width = img.getWidth();
        int height = img.getHeight();

        // convert to red image 
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int alpha = 255; //don't forget this, or use BufferedImage.TYPE_INT_RGB instead
                int red = 25; //or any formula you like
                int green = 0; //or any formula you like
                int blue = 0; //or any formula you like
                int color = (alpha << 24) | (red << 16) | (green << 8) | blue;
                img.setRGB(y, x, color);
            }
        }

        // write image 
        try {
            f = new File("aaaaacachorro-original.jpg");
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    File myFile = new File("aaaaacachorro-original.jpg");
                    desktop.open(myFile);
                } catch (IOException ex) {
                }
            }
            ImageIO.write(img, "jpg", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

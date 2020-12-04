/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Taffarel
 */
public class Picture {

    String img_name;
    BufferedImage buf_img;
    int width;
    int height;

    public Picture(String name) {
        this.img_name = name;

        try {
            buf_img = ImageIO.read(new File(img_name));
        } catch (IOException ex) {
            Logger.getLogger(Picture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Picture(int w, int h) {
        this.width = w;
        this.height = h;
        buf_img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    public int width() {
        width = buf_img.getWidth();
        return width;
    }

    public int height() {
        height = buf_img.getHeight();
        return height;
    }

    public Color get(int col, int row) {
        Color color = new Color(buf_img.getRGB(col, row));
        return color;
    }

    public void set(int col, int row, Color color) {
        buf_img.setRGB(col, row, color.getRGB());
    }

    public void show() {
        try {

            File saveAs = new File("file" + new Random().nextInt() + ".png");
            ImageIO.write(buf_img, "png", saveAs);
        } catch (IOException ex) {
            Logger.getLogger(Picture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class ColorSeparation {

    public static void main(String[] args) {

        // read in the picture specified by command-line argument
        Picture picture = new Picture("cadeado.jpg");
        int width = picture.width();
        int height = picture.height();

        // create three empy pictures of the same dimension
        Picture pictureR = new Picture(width, height);

        // separate colors
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                double L = 0.2126 * r + 0.7152 * g + 0.0722 * b;
                pictureR.set(col, row, new Color((int) 255 * (int) (L / 255), 153 * (int) L / 255, 51 * (int) L / 255));
            }
        }

        // display  picture in its own window
        pictureR.show();

    }

}

package tr.gov.tubitak.bilgem.yte;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class GrayScale {

    static BufferedImage convert(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();

        try {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = img.getRGB(x, y);
                    int alpha = (pixel >> 24)&0xff;
                    int red = (pixel >> 16)&0xff;
                    int green = (pixel >> 8)&0xff;
                    int blue = pixel&0xff;

                    int average = (red + green + blue) / 3;

                    pixel = (alpha << 24) | (average << 16) | (average << 8) | average;
                    img.setRGB(x, y, pixel);
                }
            }
            return img;
        } catch (Exception ex) {
            System.out.println("An error occurred while making image grayscale");
        }
        return null;
    }
}

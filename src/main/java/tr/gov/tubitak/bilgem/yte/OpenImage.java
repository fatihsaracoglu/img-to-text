package tr.gov.tubitak.bilgem.yte;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

class OpenImage {

    static BufferedImage openImg(String path) {
        BufferedImage image = null;
        File f = null;
        try {
            f = new File(path);
            image = ImageIO.read(f);
            return image;
        } catch (Exception ex) {
            System.out.println("An error occurred while opening image!");
        }
        return image;
    }
}

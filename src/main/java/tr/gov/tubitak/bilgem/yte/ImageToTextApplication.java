package tr.gov.tubitak.bilgem.yte;

import java.awt.image.BufferedImage;

public class ImageToTextApplication {

    public static void main(String[] args) {
        BufferedImage img = OpenImage.openImg("/Users/fatihsaracoglu/IdeaProjects/imgtotext/src/main/java/tr/gov/tubitak/bilgem/yte/image/lorem-ipsum.png");
        BufferedImage grayScaleImage = GrayScale.convert(img);
        String text = ReadImage.readImg(grayScaleImage, "eng");
        SaveText.save(text, "lorem-ipsum.txt");
    }
}

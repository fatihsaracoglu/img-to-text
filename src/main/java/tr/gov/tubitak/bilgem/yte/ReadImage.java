package tr.gov.tubitak.bilgem.yte;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.image.BufferedImage;

class ReadImage {

    static String readImg(BufferedImage img, String lang) {
        ITesseract tesseract = new Tesseract();
        tesseract.setDatapath("/Users/fatihsaracoglu/IdeaProjects/imgtotext/src/main/java/tr/gov/tubitak/bilgem/yte/language");
        tesseract.setLanguage(lang);
        String text = null;
        try {
            text = tesseract.doOCR(img);
            return text;
        } catch (TesseractException ex) {
            System.out.println("An error occurred while reading image!");
        }
        return text;
    }
}

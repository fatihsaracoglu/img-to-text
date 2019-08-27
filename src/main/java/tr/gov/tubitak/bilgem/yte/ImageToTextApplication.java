package tr.gov.tubitak.bilgem.yte;

public class ImageToTextApplication {

    public static void main(String[] args) {
        //GrayScale.convert(OpenImage.openImg("/Users/fatihsaracoglu/IdeaProjects/imgtotext/src/main/java/tr/gov/tubitak/bilgem/yte/image/lorem-ipsum.png"), "lorem-ipsum-gs.png");
        SaveText.save(ReadImage.readImg(OpenImage.openImg("/Users/fatihsaracoglu/IdeaProjects/imgtotext/src/main/java/tr/gov/tubitak/bilgem/yte/image/lorem-ipsum.png"), "eng"), "lorem-ipsum.txt");
    }
}

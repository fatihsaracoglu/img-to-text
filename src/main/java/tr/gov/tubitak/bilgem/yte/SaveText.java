package tr.gov.tubitak.bilgem.yte;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class SaveText {

    static void save(String outputText, String fileName) {
        try {
            RandomAccessFile stream = new RandomAccessFile("/Users/fatihsaracoglu/IdeaProjects/imgtotext/src/main/java/tr/gov/tubitak/bilgem/yte/text/" + fileName, "rw");
            FileChannel channel = stream.getChannel();
            byte[] strBytes = outputText.getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
            buffer.put(strBytes);
            buffer.flip();
            channel.write(buffer);
            stream.close();
            channel.close();
        } catch (IOException ex) {
            System.out.println("An error occurred while saving the file!");
        }
    }
}

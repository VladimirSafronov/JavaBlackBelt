package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {

  public static void main(String[] args) {
    try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
        FileChannel channel = file.getChannel()) {

      ByteBuffer buffer = ByteBuffer.allocate(25);
      StringBuilder stix = new StringBuilder();

      //при помощи channel читаем инф-цию из файла в буффер
      int byteRead = channel.read(buffer);
      while (byteRead > 0) {
        System.out.println("Read:" + byteRead);

        //переводим буффер в режим read
        buffer.flip();
        while (buffer.hasRemaining()) {
          stix.append((char) buffer.get());
        }
        //переводим буффер в режим write
        buffer.clear();
        byteRead = channel.read(buffer);
      }
      System.out.println(stix);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

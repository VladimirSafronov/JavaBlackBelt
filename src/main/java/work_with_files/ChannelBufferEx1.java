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

      String text = "\nWilliam Shakespeare was born in the town of Stratford, England, in the year 1564. "
          + "When he was a young man, Shakespeare moved to the city of London, where he began writing "
          + "plays. His plays were soon very successful, and were enjoyed both by the common people "
          + "of London and also by the rich and famous.";
//      //создаем новый буффер определенной длины
//      ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//      //записываем в буффер
//      buffer2.put(text.getBytes());
//      //переводим в режим чтения
//      buffer2.flip();
//      //записываем информацию в channel
//      channel.write(buffer2);

      //более элегантный вариант записи в файл
      ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
      channel.write(buffer2);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

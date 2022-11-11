package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {

  public static void main(String[] args) {
    try(RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
        FileChannel channel = file.getChannel()) {

      ByteBuffer buffer = ByteBuffer.allocate(5);
      channel.read(buffer);
      buffer.flip();
      System.out.println( (char) buffer.get());
      System.out.println( (char) buffer.get());
      System.out.println( (char) buffer.get());
      buffer.rewind();//устанавливает position на 0 не меняя режим работы
      System.out.println( (char) buffer.get());//a
      System.out.println("------------");

      buffer.compact();//копирует непрочитанные данные из старого буффера в новый,устанавливая position в конце данных
      channel.read(buffer);
      buffer.flip();
      while (buffer.hasRemaining()) {
        System.out.println((char) buffer.get());
      }
      System.out.println("------------");

      buffer.clear();
      channel.read(buffer);
      buffer.flip();
      System.out.println((char) buffer.get());
      buffer.mark();//оставить метку на позиции
      System.out.println((char) buffer.get());
      System.out.println((char) buffer.get());
      buffer.reset();//вернуться на позицию с меткой
      System.out.println((char) buffer.get());


    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

  public static void main(String[] args) {
    try(RandomAccessFile raf = new RandomAccessFile("test10.txt", "rw")) {

      int a = raf.read();
      System.out.println((char) a);
      String str1 = raf.readLine();
      System.out.println(str1);
      raf.seek(101);
      System.out.println(raf.readLine());
      long pos = raf.getFilePointer();
      System.out.println(pos);

//      raf.seek(0);
//      raf.writeBytes("HELLO");

      raf.seek(raf.length() - 1);
      raf.writeBytes("\n\t\t\t\t\tUnknown");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {

  public static void main(String[] args) {
    try (FileInputStream input =
        new FileInputStream(
            "/Users/vladimirsafronov/Desktop/photo_2020-03-10-12.17.30-1080x717-1.jpeg");
        FileOutputStream output = new FileOutputStream("java_pic.jpg")) {
      int i;
      while ((i = input.read()) != -1) {
        output.write(i);
      }
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

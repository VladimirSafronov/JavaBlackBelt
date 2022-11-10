package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

  public static void main(String[] args) {
    String rubai = "Много лет размышлял я над жизнью земной.\n" +
        "Непонятного нет для меня под луной.\n" +
        "Мне известно, что мне ничего неизвестно!\n" +
        "Вот последняя правда, открытая мной.\n";

    String str = "Hello!";

    try (FileWriter writer = new FileWriter("test1.txt", true)) {
//      for(int i = 0; i < rubai.length(); i++) {
//        writer.write(rubai.charAt(i));
//      }
//      writer.write(rubai);
      writer.write(str);
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

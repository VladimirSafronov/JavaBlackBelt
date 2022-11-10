package work_with_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyEx {

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("test1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))) {
//      int character;
//      while ((character = reader.read()) != -1) {
//        writer.write(character);
//      }

      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.write('\n');
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

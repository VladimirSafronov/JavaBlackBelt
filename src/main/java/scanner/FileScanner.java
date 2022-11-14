package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileScanner {

  public static void main(String[] args) {
    Set<String> sortedWords = new TreeSet<>();

    try (Scanner scanner = new Scanner(new FileReader(new File("test1.txt")))) {
      scanner.useDelimiter("\\W");
      while (scanner.hasNext()) {
        String word = scanner.next();
        sortedWords.add(word);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Uncorrected file path");
    }

    for (String word : sortedWords) {
      System.out.println(word);
    }
  }
}

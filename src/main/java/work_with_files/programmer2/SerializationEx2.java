package work_with_files.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import work_with_files.programmer1.Employee;

public class SerializationEx2 {

  public static void main(String[] args) {
    Employee bestEmployee;
    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
      bestEmployee = (Employee) input.readObject();
      System.out.println(bestEmployee);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

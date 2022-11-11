package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

  public static void main(String[] args) {
    Car car = new Car("Lada", "white");
    Employee emp1 = new Employee("Maria", "Zaharova", "IT", 25, 500, car);
    try (ObjectOutputStream output = new ObjectOutputStream(
        new FileOutputStream("employees2.bin"))) {
      output.writeObject(emp1);
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

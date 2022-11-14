package reflection_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

  void sum(int a, int b) {
    int result = a + b;
    System.out.println("Сумма " + a + " и " + b + " = " + result);
  }

  void subtraction(int a, int b) {
    int result = a - b;
    System.out.println("Разница " + a + " и " + b + " = " + result);
  }

  void multiplication(int a, int b) {
    int result = a * b;
    System.out.println("Произведение " + a + " и " + b + " = " + result);
  }

  void division(int a, int b) {
    int result = a / b;
    System.out.println("Частное " + a + " и " + b + " = " + result);
  }
}

class TestCalculator {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(new FileReader(new File("test100.txt")))) {
      String methodName = scanner.nextLine();
      String firstArg = scanner.nextLine();
      String secondArg = scanner.nextLine();

      Calculator calculator = new Calculator();
      Class calculatorClass = calculator.getClass();
      Method method = null;
      Method[] methods = calculatorClass.getDeclaredMethods();

      for(Method m : methods) {
        if(m.getName().equals(methodName)) {
          method = m;
          break;
        }
      }

      method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));

    } catch (FileNotFoundException | InvocationTargetException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
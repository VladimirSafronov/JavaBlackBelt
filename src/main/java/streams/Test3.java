package streams;

import java.util.Arrays;

public class Test3 {

  public static void main(String[] args) {
    int[] numbers = {5, 2, 6, 1, 9};
//    Arrays.stream(numbers).forEach(el -> System.out.print(el + " "));
//    Arrays.stream(numbers).forEach(System.out::println);

//    Arrays.stream(numbers).forEach(Util::myMethod);
    Arrays.stream(numbers).forEach(el -> Util.myMethod(el));

  }
}

class Util {

  public static void myMethod(int a) {
    a += 5;
    System.out.print(a + " ");
  }
}
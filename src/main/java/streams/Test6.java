package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {

  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//    stream.filter( n -> {
//      System.out.println("!!!");
//      return n % 2 == 0;
//    }).collect(Collectors.toList()); //пока не вызван Terminal method, Intermediate метод не сработает

  }
}

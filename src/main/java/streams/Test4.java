package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(10);
    numbers.add(6);
    numbers.add(8);
//    List<Integer> numbers2 = new ArrayList<>();
    Optional<Integer> optional = numbers.stream()
        .reduce( (accumulator, element) -> accumulator * element);
    // 5, 2, 10, 6, 8
    // accumulator =   5   10   100   600   4800
    // element     =   2   10    6     8

    int result = 0;
    //Чтобы избежать получение null, и NoSuchElementException,
    // проверяем на присутствие значения - Optional.isPresent()
    if (optional.isPresent()) {
      result = optional.get();
    }
//    System.out.println(result);

    //второй вариант исп-ния reduce()
    //задаем аккумулятору значение 1, не нужно использовать метод get(),т.к. имеем как минимум единицу
    int result2 = numbers.stream()
        .reduce(1, (accumulator, element) -> accumulator * element);
    // 5, 2, 10, 6, 8
    // accumulator =   1   2   10   100   600   4800
    // element     =   2   5   10    6     8
    System.out.println(result2);

    List<String> strings = new ArrayList<>();
    strings.add("privet");
    strings.add("kak dela?");
    strings.add("otlichno");
    strings.add("poka");

    String result3 = strings.stream()
        .reduce( (accumulator, element) -> accumulator + " " + element).get();
    System.out.println(result3);
  }

}

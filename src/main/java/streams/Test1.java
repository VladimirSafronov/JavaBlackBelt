package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test1 {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("privet");
    list1.add("kak dela?");
    list1.add("ok");
    list1.add("poka");
//    System.out.println(list1);

//    for (String str : list1) {
//      System.out.print(str.length() + " ");
//    }
    List<Integer> list2 = list1.stream()
        .map(el -> el.length())
        .collect(Collectors.toList());
//    System.out.println(list2);

    int[] numbers = new int[]{3, 7, 9, 2, 10};
//    for (int i = 0; i < numbers.length; i++) {
//      if (numbers[i] % 3 == 0) {
//        numbers[i] /= 3;
//      } else {
//        numbers[i] *= -1;
//      }
//    }
    numbers = Arrays.stream(numbers)
        .map(el -> {
          if (el % 3 == 0) {
            el = el / 3;
          } else {
            el = el * -1;
          }
          return el;
        }).toArray();
//    System.out.println(Arrays.toString(numbers));

    Set<String> set = new TreeSet<>();
    set.add("privet");
    set.add("kak dela?");
    set.add("ok");
    set.add("poka");
    System.out.println(set);
    List<Integer> list3 = set.stream()
        .map( el -> el.length())
        .collect(Collectors.toList());
    System.out.println(list3);
  }
}

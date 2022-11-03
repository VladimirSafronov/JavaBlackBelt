package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("privet");
    list.add("kak");
    list.add("dela");
    list.add("ychim java");
    list.add("a imenno lambdas");
//    list.removeIf(el -> el.length() < 5); //метод removeIf использует Predicate<>
    Predicate<String> p = el -> el.length() < 5;
    list.removeIf(p);
    System.out.println(list);
  }
}

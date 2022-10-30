package generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {

  public static void main(String[] args) {
    List<Integer> arr1 = new ArrayList<>();
    arr1.add(10);
    arr1.add(20);
    arr1.add(5);
    int a = GenericMethod.getSecondElement(arr1);
    System.out.println(a);

    List<String> arr2 = new ArrayList<>();
    arr2.add("abc");
    arr2.add("def");
    arr2.add("ghi");
    String s = GenericMethod.getSecondElement(arr2);
    System.out.println(s);
  }
}

class GenericMethod {

  public static <T> T getSecondElement(List<T> arr) {
    return arr.get(1);
  }
}

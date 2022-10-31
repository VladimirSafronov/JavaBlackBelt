package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

  public static void main(String[] args) {
    List<String> arrL1 = new ArrayList<>();
    arrL1.add("Zaur");
    arrL1.add("Ivan");
    arrL1.add("Maria");
    System.out.println(arrL1);

    List<String> arrL2 = new ArrayList<>(100);
    arrL2.add("Zaur");
    arrL2.add("Ivan");

    List<String> arrL3 = new ArrayList<>(arrL1);
    System.out.println(arrL3);
    System.out.println(arrL3 == arrL1);
  }
}

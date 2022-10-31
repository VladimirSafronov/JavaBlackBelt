package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {

  public static void main(String[] args) {
    List<String> arrL1 = new ArrayList<>();
    arrL1.add("Zaur");
    arrL1.add("Ivan");
    arrL1.add("Maria");
    System.out.println(arrL1);
    List<String> arrL2 = new ArrayList<>();
    arrL2.add("!!!");
    arrL2.add("???");
    arrL1.addAll(1, arrL2);
    arrL1.add("Ivan");
    System.out.println(arrL1);
    arrL2.clear();
//    System.out.println(arrL2);
//    System.out.println(arrL1.indexOf("Ivan"));
//    System.out.println(arrL1.lastIndexOf("Ivan"));
//    System.out.println(arrL1.isEmpty());
//    System.out.println(arrL2.isEmpty());
    System.out.println(arrL1.contains("Nikolay"));
    System.out.println(arrL1.contains("Maria"));

  }
}

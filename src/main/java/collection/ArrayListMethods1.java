package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {

  public static void main(String[] args) {
    List<String> arrL1 = new ArrayList<>();
    arrL1.add("Zaur");
    arrL1.add("Ivan");
    arrL1.add("Maria");
    arrL1.add(1, "Misha");
//    arrL1.add(10, "Jkob"); //будет IndexOutOfBoundException

    for (String s : arrL1) {
      System.out.print(s + " ");
    }
    System.out.println();
    System.out.println(arrL1.get(2));
    //set вставляет элемент на указанный индекс, заменяя предыдущий
    arrL1.set(0, "ZaurTr");
    arrL1.remove(0);
    System.out.println(arrL1);
  }

}

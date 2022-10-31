package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

  public static void main(String[] args) {
    List<String> arrL1 = new ArrayList<>();
    arrL1.add("Zaur");
    arrL1.add("Ivan");
    arrL1.add("Maria");
    arrL1.add("Kolia");
    arrL1.add("Elena");
    System.out.println(arrL1);

    Iterator<String> iterator = arrL1.iterator();
    while (iterator.hasNext()) {
      iterator.next(); //важно не забыть получить следующий элемент, потому что в while мы только проверяем имеется ли он
      iterator.remove();
    }
    System.out.println(arrL1);
  }
}

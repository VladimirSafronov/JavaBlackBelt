package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {

  public static void main(String[] args) {
    List<String> arrL1 = new ArrayList<>();
    arrL1.add("Zaur");
    arrL1.add("Ivan");
    arrL1.add("Maria");
    arrL1.add("Kolia");
    arrL1.add("Elena");
    System.out.println(arrL1);

    //создание следующих списков происходит при помощи статичных методов
    //данные списки неизменяемы, и не могут содержать null
//    List<Integer> list = List.of(1, 3, 8);
//    list.add(100); //UnsupportedOperationException
    List<String> list2 = List.copyOf(arrL1);
    System.out.println(list2);

//    Object[] array = arrL1.toArray();
//    String[] array2 = arrL1.toArray(new String[0]); //java сама задаст нужный размер массива,но можно и самостоятельно задать
//    for (String s : array2) {
//      System.out.print(s + " ");
//    }

//    List<String> myList = arrL1.subList(1, 4); //myList это не отдельная сущность, он связан с arrL1
//    System.out.println(myList);
//    myList.add("Fedor");
//    System.out.println(myList);
//    System.out.println(arrL1);
//    arrL1.add("Sveta");
//    System.out.println(arrL1);
//    System.out.println(myList); //ConcurrentModificationException - все изменения должны быть с view (то есть с myList)

//    List<String> arrL2 = new ArrayList<>();
//    arrL2.add("Ivan");
//    arrL2.add("Maria");
//    arrL2.add("Igor");

//    arrL1.removeAll(arrL2);
//    arrL1.retainAll(arrL2);
//    System.out.println(arrL1);
//    boolean result = arrL1.containsAll(arrL2);
//    System.out.println(result);
  }
}

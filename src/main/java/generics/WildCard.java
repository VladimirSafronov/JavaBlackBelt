package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCard {
  public static void main(String[] args) {

    //так работать не будет
//    List<Number> list = new ArrayList<Integer>();
//    List<Object> list2 = new ArrayList<Integer>();
    //так можно
    List<?> list3 = new ArrayList<String>();
//    list3.add("hi"); //но компилятор не даст ничего добавить,потому что не знает какого типа list3
    //можно задавать границы для wildcards
    List<? extends Number> list30 = new ArrayList<Integer>(); //только наследники и Number
    List<? super Number> list31 = new ArrayList<Object>(); //только Number и его предки

    List<Double> list4 = new ArrayList<>();
    list4.add(3.14);
    list4.add(3.15);
    list4.add(3.16);
    getListElements(list4);

    List<String> list5 = new ArrayList<>();
    list5.add("ok");
    list5.add("bye");
    list5.add("hello");
    getListElements(list5);

    List<Double> list6 = new ArrayList<>();
    list6.add(3.14);
    list6.add(3.15);
    list6.add(3.16);
    System.out.println(sumElements(list6));

    List<Integer> list7 = new ArrayList<>();
    list7.add(7);
    list7.add(71);
    list7.add(27);
    System.out.println(sumElements(list7));
  }

  static void getListElements(List<?> list) {
    System.out.println("list contains the elements: " + list);
  }

  static double sumElements(List<? extends Number> arr) {
    double ans = 0;
    for (Number n : arr) {
      ans += n.doubleValue();
    }
    return ans;
  }
}

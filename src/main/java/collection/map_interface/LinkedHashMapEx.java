package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

  public static void main(String[] args) {
    Student st1 = new Student("Zaur", "Tregulov", 3);
    Student st2 = new Student("Maria", "Aksenova", 1);
    Student st3 = new Student("Ivan", "Poddubnui", 2);
    Student st4 = new Student("Karim", "Benzema", 5);
    //второй возможный конструктор
    LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
    lhm.put(5.5, st3);
    lhm.put(5.8, st4);
    lhm.put(6.8, st1);
    lhm.put(8.7, st2);
    System.out.println(lhm);

    System.out.println(lhm.get(5.5));
    System.out.println(lhm.get(6.8));//последний использованный эл-т будет последним в списке
    System.out.println(lhm);

  }
}

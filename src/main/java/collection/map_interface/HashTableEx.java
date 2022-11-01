package collection.map_interface;

import java.util.Hashtable;

public class HashTableEx {

  public static void main(String[] args) {
    Hashtable<Double, Student> ht = new Hashtable<>();
    Student st1 = new Student("Zaur", "Tregulov", 3);
    Student st2 = new Student("Maria", "Aksenova", 1);
    Student st3 = new Student("Ivan", "Poddubnui", 2);
    Student st4 = new Student("Karim", "Benzema", 5);
    ht.put(7.8, st1);
    ht.put(8.8, st2);
    ht.put(6.5, st3);
    ht.put(7.1, st4);
    //null ни в ключе, ни в значении использовать нельзя
//    ht.put(null, st1);
//    ht.put(6.0, null);
    System.out.println(ht);
  }
}

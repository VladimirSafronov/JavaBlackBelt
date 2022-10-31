package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

  public static void main(String[] args) {
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(1000, "Zaur Tregulov");
    map1.put(2123, "Ivan Ivanov");
    map1.put(3457, "Mariya Sidorova");
    map1.put(9376, "Nikolay Petrov");
    map1.put(null, "Sergey Petrov");
    map1.put(6385, null);
    map1.putIfAbsent(1000, "Oleg Petrov");
    System.out.println(map1);
    System.out.println(map1.get(1000)); //null, если данного ключа не существует
    map1.remove(null);
//    System.out.println(map1);
    System.out.println(map1.containsValue("Oleg Petrov"));
    System.out.println(map1.containsKey(3457));
    System.out.println(map1.keySet());
    System.out.println(map1.values());
  }
}

package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

  public static void main(String[] args) {

    Set<String> set = new HashSet<>();
    set.add("Zaur");
    set.add("Vika");
    set.add("Igor");
    set.add("Marina");
    set.add(null);
    System.out.println(set);
    set.remove(null);
    for (String s : set) {
      System.out.println(s);
    }
    System.out.println("set size is: " + set.size());
    System.out.println("is set empty? " + set.isEmpty());
    System.out.println("is set contains Misha? " + set.contains("Misha"));
    System.out.println("is set contains Marina? " + set.contains("Marina"));
  }
}

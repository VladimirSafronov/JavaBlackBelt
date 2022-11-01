package collection.map_interface;

import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<Double, Student> treeMap = new TreeMap<>();
    Student st1 = new Student("Zaur", "Tregulov", 3);
    Student st2 = new Student("Maria", "Aksenova", 1);
    Student st3 = new Student("Ivan", "Poddubnui", 2);
    Student st4 = new Student("Karim", "Benzema", 5);
    Student st5 = new Student("Leo", "Messi", 1);
    Student st6 = new Student("Ivan", "Cordoba", 2);
    Student st7 = new Student("Pavel", "Kokorin", 4);
    treeMap.put(6.8, st1);
    treeMap.put(8.7, st2);
    treeMap.put(5.5, st3);
    treeMap.put(5.8, st4);
    treeMap.put(8.1, st5);
    treeMap.put(7.8, st6);
    treeMap.put(2.2, st7);
    System.out.println(treeMap);

//    System.out.println(treeMap.get(7.8));
//    treeMap.remove(2.2);
//    System.out.println(treeMap);
//    System.out.println(treeMap.descendingMap()); //получение значений по убыванию
//    System.out.println(treeMap.tailMap(7.8)); //получение значений включая и выше указанного ключа
//    System.out.println(treeMap.headMap(7.8)); //получение значений ниже указанного ключа
//    System.out.println(treeMap.lastEntry());
//    System.out.println(treeMap.firstEntry());


    //    TreeMap<Student, Double> treeMap = new TreeMap<>(new Comparator<Student>() {
//      @Override
//      public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
//      }
//    });

//    Student st1 = new Student("Zaur", "Tregulov", 3);
//    Student st2 = new Student("Maria", "Aksenova", 1);
//    Student st3 = new Student("Ivan", "Poddubnui", 2);
//    Student st4 = new Student("Karim", "Benzema", 5);
//    Student st5 = new Student("Leo", "Messi", 1);
//    Student st6 = new Student("Ivan", "Cordoba", 2);
//    Student st7 = new Student("Pavel", "Kokorin", 4);
//    treeMap.put(st1, 6.8);
//    treeMap.put(st7, 2.2);
//    treeMap.put(st2, 8.7);
//    treeMap.put(st6, 7.8);
//    treeMap.put(st3, 5.5);
//    treeMap.put(st5, 8.1);
//    treeMap.put(st4, 5.8);
//    System.out.println(treeMap);

//    TreeMap<Student, Double> treeMap = new TreeMap<>();
//    Student st1 = new Student("Zaur", "Tregulov", 3);
//    Student st2 = new Student("Maria", "Aksenova", 1);
//    Student st3 = new Student("Ivan", "Poddubnui", 2);
//    Student st4 = new Student("Karim", "Benzema", 5);
//    Student st5 = new Student("Leo", "Messi", 1);
//    Student st6 = new Student("Ivan", "Cordoba", 2);
//    Student st7 = new Student("Pavel", "Kokorin", 4);
//    treeMap.put(st1, 6.8);
//    treeMap.put(st7, 2.2);
//    treeMap.put(st2, 8.7);
//    treeMap.put(st6, 7.8);
//    treeMap.put(st3, 5.5);
//    treeMap.put(st5, 8.1);
//    treeMap.put(st4, 5.8);
//    System.out.println(treeMap);

//    System.out.println(treeMap.get(7.8));
//    treeMap.remove(2.2);
//    System.out.println(treeMap);
//    System.out.println(treeMap.descendingMap()); //получение значений по убыванию
//    System.out.println(treeMap.tailMap(7.8)); //получение значений включая и выше указанного ключа
//    System.out.println(treeMap.headMap(7.8)); //получение значений ниже указанного ключа
//    System.out.println(treeMap.lastEntry());
//    System.out.println(treeMap.firstEntry());
  }
}

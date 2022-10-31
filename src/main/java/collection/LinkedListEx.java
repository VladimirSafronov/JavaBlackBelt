package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

  public static void main(String[] args) {
    Student2 st1 = new Student2("Nikolay", 2);
    Student2 st2 = new Student2("Oleg", 4);
    Student2 st3 = new Student2("Maria", 1);
    Student2 st4 = new Student2("Egor", 3);
    Student2 st5 = new Student2("Alena", 5);
    List<Student2> linkedList = new LinkedList<>();
    linkedList.add(st1);
    linkedList.add(st2);
    linkedList.add(st3);
    linkedList.add(st4);
    linkedList.add(st5);
    System.out.println("LinkedList = " + linkedList);
    System.out.println(linkedList.get(2));
    Student2 st6 = new Student2("Zaur", 3);
    Student2 st7 = new Student2("Igor", 4);
    linkedList.add(st6);
    System.out.println("LinkedList = " + linkedList);
    linkedList.add(1, st7);
    System.out.println("LinkedList = " + linkedList);
    linkedList.remove(3);
    System.out.println("LinkedList = " + linkedList);

  }
}

class Student2 {
  String name;
  int course;

  public Student2(String name, int course) {
    this.name = name;
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student2{" +
        "name='" + name + '\'' +
        ", course=" + course +
        '}';
  }
}
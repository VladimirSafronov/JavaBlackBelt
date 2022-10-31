package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {

  public static void main(String[] args) {
    Map<Student, Double> map = new HashMap<>();
    Student st1 = new Student("Zaur", "Tregulov", 3);
    Student st2 = new Student("Maria", "Aksenova", 1);
    Student st3 = new Student("Ivan", "Poddubnui", 2);
    map.put(st1, 7.8);
    map.put(st2, 9.8);
    map.put(st3, 6.8);
    System.out.println(map);

    Student st4 = new Student("Zaur", "Tregulov", 3);
    boolean result = map.containsKey(st4);
    System.out.println("result = " + result);
//    System.out.println(st1.equals(st4));
    System.out.println(st1.hashCode());
    System.out.println(st2.hashCode());

  }
}

class Student {
  String name;
  String surName;
  int course;

  public Student(String name, String surName, int course) {
    this.name = name;
    this.surName = surName;
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", surName='" + surName + '\'' +
        ", course=" + course +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return course == student.course && Objects.equals(name, student.name)
        && Objects.equals(surName, student.surName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surName, course);
  }

  //топорная реализация
//    @Override
//  public int hashCode() {
//    return name.length() * 7 + surName.length() * 11 + course * 51;
//  }
}
package collection.set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {

  public static void main(String[] args) {
    TreeSet<Student> treeSet = new TreeSet<>();
    Student st1 = new Student("Zaur", 4);
    Student st2 = new Student("Misha", 1);
    Student st3 = new Student("Lera", 3);
    Student st4 = new Student("Oksana", 2);
    Student st5 = new Student("Olia", 1); //таакое значение курса уже есть,поэтому оно не добавится
    treeSet.add(st1);
    treeSet.add(st2);
    treeSet.add(st3);
    treeSet.add(st4);
    treeSet.add(st5);
    System.out.println(treeSet);
    System.out.println(treeSet.first());
    System.out.println(treeSet.last());
    Student st6 = new Student("Oleg", 2);
    System.out.println(treeSet.headSet(st6)); //выведет все элементы ниже данного (1 и 2курс)
    System.out.println(treeSet.tailSet(st6)); //выведет все элементы данного и выше (3,4,5курс)
    Student st7 = new Student("Ivan", 4);
    System.out.println(treeSet.subSet(st6, st7)); //выведет все элементы между данными эл-тами
    System.out.println(st4.equals(st6));
    System.out.println(st6.hashCode() == st4.hashCode());
  }
}

class Student implements Comparable<Student> {
  String name;
  int course;

  public Student(String name, int course) {
    this.name = name;
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", course=" + course +
        '}';
  }

  @Override
  public int compareTo(Student o) {
    return this.course - o.course;
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
    return course == student.course;
  }

  @Override
  public int hashCode() {
    return Objects.hash(course);
  }
}
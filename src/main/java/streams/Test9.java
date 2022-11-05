package streams;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.9);
    Student st2 = new Student("Masha", 'f', 24, 5, 7.9);
    Student st3 = new Student("Misha", 'm', 18, 1, 9.3);
    Student st4 = new Student("Olia", 'f', 28, 2, 7.3);
    Student st5 = new Student("Stas", 'm', 33, 2, 6.9);
    List<Student> students = new ArrayList<>();
    students.add(st1);
    students.add(st2);
    students.add(st3);
    students.add(st4);
    students.add(st5);

    Student theYoungest = students.stream().
        min((s1, s2) -> s1.getAge() - s2.getAge()).get();
    Student theOldest = students.stream()
        .max((s1, s2) -> s1.getAge() - s2.getAge()).get();
    System.out.println(theYoungest);
    System.out.println(theOldest);
  }
}

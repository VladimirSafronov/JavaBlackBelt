package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {
  static double getAvgSmth(List<Student> list, Function<Student, Double> func) {
    double result = 0;
    for (Student st : list) {
      result += func.apply(st);
    }
    result = result / list.size();
    return result;
  }

  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.9);
    Student st2 = new Student("Marina", 'f', 21, 2, 7.9);
    Student st3 = new Student("Nikolay", 'm', 20, 2, 8.1);
    Student st4 = new Student("Karina", 'f', 24, 4, 8.4);
    Student st5 = new Student("Misha", 'm', 18, 1, 6.9);
    List<Student> students = new ArrayList<>();
    students.add(st1);
    students.add(st2);
    students.add(st3);
    students.add(st4);
    students.add(st5);

    System.out.println(getAvgSmth(students, stud -> (double) stud.course));
  }
}

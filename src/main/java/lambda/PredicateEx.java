package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

  public void testStudents(List<Student> list, Predicate<Student> pr) {
    for (Student l : list) {
      if (pr.test(l)) {
        System.out.println(l);
      }
    }
  }

}

class Test3 {
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

    PredicateEx obj = new PredicateEx();
//    obj.testStudents(students, s -> s.name.startsWith("M"));
//    System.out.println("_________");
//    obj.testStudents(students, s -> s.sex == 'f');
//    System.out.println("_________");
//    obj.testStudents(students, s -> s.avgGrade >= 8 && s.avgGrade < 9);

    Predicate<Student> p1 = s -> s.sex == 'm';
    Predicate<Student> p2 = s -> s.avgGrade > 8;
//    obj.testStudents(students, p1.and(p2)); //логическое и
//    obj.testStudents(students, p1.or(p2)); //логическое или
    obj.testStudents(students, p1.negate()); //логическое не
  }
}
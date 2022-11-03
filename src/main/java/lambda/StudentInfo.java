package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo {
//  void printStudentsOverGrade (List<Student> list, double grade) {
//    for (Student l : list) {
//      if (l.avgGrade > grade) {
//        System.out.println(l);
//      }
//    }
//  }
//
//  void printStudentsUnderAge (List<Student> list, int age) {
//    for (Student l : list) {
//      if (l.age < age) {
//        System.out.println(l);
//      }
//    }
//  }
//
//  void printStudentsMixCondition (List<Student> list, int age, char sex, double grade) {
//    for (Student l : list) {
//      if (l.age>age && l.sex == sex && l.avgGrade < grade) {
//        System.out.println(l);
//      }
//    }
//  }

  public void testStudents(List<Student> list, StudentCheck studentCheck) {
    for (Student l : list) {
      if (studentCheck.check(l)) {
        System.out.println(l);
      }
    }
  }

}

class Test {
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

    Collections.sort(students, (s1, s2) -> s1.course - s2.course);
    System.out.println(students);

    StudentInfo info = new StudentInfo();

//    info.printStudentsOverGrade(students, 8.0);
//    System.out.println("_________");
//    info.printStudentsUnderAge(students, 22);
//    System.out.println("_________");
//    info.printStudentsMixCondition(students, 23, 'f', 9.0);
//
//    info.testStudents(students, new CheckOverGrade());
//    System.out.println("__________");
//
//    //чтобы не создавать класс, можно воспользоваться анонимным классом
//    info.testStudents(students, new StudentCheck() {
//      @Override
//      public boolean check(Student student) {
//        return student.age > 21;
//      }
//    });
//
//    System.out.println("__________");

//    info.testStudents(students, (Student s) -> {return s.age < 21;});

    info.testStudents(students, s -> s.age < 21); //короткий вариант написания

//    info.testStudents(students, (Student s) -> s.age < 21); //указывая тип аргумента,пишем все в скобках

    //при нескольких стейтментах в теле метода, используй длинный вариант написания
//    info.testStudents(students, s -> {
//      System.out.println();
//      return s.age < 21;});

    System.out.println("__________");
    info.testStudents(students, (Student s) -> {return s.avgGrade < 7.5;});
    System.out.println("__________");
    info.testStudents(students, (Student s) -> {return s.sex == 'f' && s.age > 22;});
  }
}

interface StudentCheck {
  boolean check(Student student);
}

class CheckOverGrade implements StudentCheck {

  @Override
  public boolean check(Student student) {
    return student.avgGrade > 8.0;
  }
}
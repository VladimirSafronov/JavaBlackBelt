package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods2 {

  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
    Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
    Student st3 = new Student("Elena", 'w', 23, 4, 7.9);
    Student st4 = new Student("Nastya", 'w', 25, 5, 6.9);
    Student st5 = new Student("Karina", 'w', 18, 1, 9.5);
    List<Student> studentList = new ArrayList<>();
    studentList.add(st1);
    studentList.add(st2);
    studentList.add(st3);
    studentList.add(st4);
    studentList.add(st5);
    System.out.println(studentList);
    Student st6 = new Student("Nastya", 'w', 25, 5, 6.9);
//    studentList.remove(st6);
    int index = studentList.indexOf(st6);
    System.out.println(index);
  }
}

class Student {
  private String name;
  private char sex;
  private int age;
  private int course;
  private double avgGrade;

  public Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", sex=" + sex +
        ", age=" + age +
        ", course=" + course +
        ", avgGrade=" + avgGrade +
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
    return sex == student.sex && age == student.age && course == student.course
        && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name,
        student.name);
  }

}

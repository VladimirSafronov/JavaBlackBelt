package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

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

    students = students.stream()
        .filter( s -> s.getAge() > 22 && s.getAvgGrade() < 7.5)
        .collect(Collectors.toList());
    System.out.println(students);
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public double getAvgGrade() {
    return avgGrade;
  }

  public void setAvgGrade(double avgGrade) {
    this.avgGrade = avgGrade;
  }
}
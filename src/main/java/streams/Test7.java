package streams;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.9);
    Student st2 = new Student("Masha", 'f', 24, 5, 7.9);
    Student st3 = new Student("Misha", 'm', 18, 1, 9.3);
    Student st4 = new Student("Olia", 'f', 28, 2, 7.3);
    Student st5 = new Student("Stas", 'm', 33, 2, 6.9);

    Faculty fac1 = new Faculty("Economics");
    Faculty fac2 = new Faculty("Physical Education");
    List<Faculty> faculties = new ArrayList<>();
    faculties.add(fac1);
    faculties.add(fac2);
    fac1.addStudentToFaculty(st1);
    fac1.addStudentToFaculty(st2);
    fac2.addStudentToFaculty(st3);
    fac2.addStudentToFaculty(st4);
    fac2.addStudentToFaculty(st5);

    faculties.stream().flatMap( list -> list.facultiesStudents.stream())
        .forEach(System.out::println);
  }
}

class Faculty {
  String name;
  List<Student> facultiesStudents;

  public Faculty(String name) {
    this.name = name;
    facultiesStudents = new ArrayList<>();
  }

  public List<Student> getFacultiesStudents() {
    return facultiesStudents;
  }

  public void addStudentToFaculty(Student st) {
    facultiesStudents.add(st);
  }
}
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

//    Student theYoungest = students.stream().
//        min((s1, s2) -> s1.getAge() - s2.getAge()).get();
//    Student theOldest = students.stream()
//        .max((s1, s2) -> s1.getAge() - s2.getAge()).get();
//    System.out.println(theYoungest);
//    System.out.println(theOldest);

//    students.stream().filter( el -> el.getCourse() > 1).forEach(System.out::println);
//    System.out.println("_______________________");
//    students.stream().filter( el -> el.getCourse() > 1).limit(2).forEach(System.out::println);
//    System.out.println("_______________________");
//    students.stream().filter( el -> el.getCourse() > 1).skip(2).forEach(System.out::println);

    List<Integer> cources = students.stream().mapToInt(el -> el.getCourse())
        .boxed().collect(Collectors.toList());
    System.out.println(cources);

    int totalAge = students.stream().mapToInt(el -> el.getAge()).sum();
    System.out.println("Total students age is " + totalAge);

    double averageGrade = students.stream().mapToDouble(el -> el.getAvgGrade()).average().getAsDouble();
    System.out.println("Average grade from all students is " + averageGrade);

    int minAge = students.stream().mapToInt(el -> el.getAge()).min().getAsInt();
    System.out.println("The youngest student is " + minAge + " years old");

    int maxCourse = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
    System.out.println("Max course is " + maxCourse);
  }
}

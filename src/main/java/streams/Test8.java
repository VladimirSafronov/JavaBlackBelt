package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {

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

//    Map<Integer, List<Student>> map = students.stream().map(el -> {
//      el.setName(el.getName().toUpperCase());
//      return el;
//    }).collect(Collectors.groupingBy(el -> el.getCourse()));
//    for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//      System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//    }

    Map<Boolean, List<Student>> map2 = students.stream()
        .collect(Collectors.partitioningBy( el -> el.getAvgGrade() > 7.5));
    for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue().toString());
    }
  }
}

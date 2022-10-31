package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

  public static void main(String[] args) {
//    Employee emp1 = new Employee("Nikolay", 645);
//    Employee emp2 = new Employee("Elena", 231);
//    Employee emp3 = new Employee("Vladimir", 100);
//    Employee emp4 = new Employee("Zaur", 350);
//    Employee emp5 = new Employee("Karina", 900);
//    Employee emp6 = new Employee("Olga", 1200);
//    Employee emp7 = new Employee("Makar", 231);
//    List<Employee> employeeList = new ArrayList<>();
//    employeeList.add(emp1);
//    employeeList.add(emp2);
//    employeeList.add(emp3);
//    employeeList.add(emp4);
//    employeeList.add(emp5);
//    employeeList.add(emp6);
//    employeeList.add(emp7);
//    System.out.println(employeeList);
//    Collections.sort(employeeList);
//    System.out.println(employeeList);
//    int index = Collections.binarySearch(employeeList, new Employee("Makar", 231));
//    System.out.println(index);

//    int[] array = {-3, 1, 10, 77, 105, -47, 88, -23, 32, -5};
//    System.out.println(Arrays.toString(array));
//    Arrays.sort(array);
//    System.out.println(Arrays.toString(array));
//    int index2 = Arrays.binarySearch(array, 10);
//    System.out.println(index2);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(16);
    numbers.add(-32);
    numbers.add(-89);
    numbers.add(150);
    numbers.add(15);
    numbers.add(0);
    numbers.add(-96);
    numbers.add(1);
    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);
    Collections.reverse(numbers);
    System.out.println(numbers);
    Collections.shuffle(numbers);
    System.out.println(numbers);
  }
}

class Employee implements Comparable<Employee> {
  private int id;
  private String name;
  private int salary;
  private static int idCounter = 1;

  public Employee(String name, int salary) {
    this.id = idCounter++;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee emp) {
    if (this.salary == emp.salary) {
      return this.name.compareTo(emp.name);
    } else if (this.salary < emp.salary) {
      return 1;
    } else {
      return -1;
    }
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }
}
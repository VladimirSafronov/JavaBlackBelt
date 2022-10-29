package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    Employee emp1 = new Employee(11, "Zaur", "Tregulov", 1234);
    Employee emp2 = new Employee(5, "Ivan", "Sidorov", 12434);
    Employee emp3 = new Employee(111, "Ivan", "Kondrashev", 134);
    List<Employee> list = new ArrayList<>();
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    System.out.println("before sorting \n" + list);
    Collections.sort(list);
    System.out.println("after sorting \n" + list);

  }

}

class Employee implements Comparable<Employee> {

  Integer id;
  String name;
  String surname;
  int salary;

  public Employee(int id, String name, String surname, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        '}';
  }

  @Override
  public int compareTo(Employee anotherEmp) {
//    if (this.id == anotherEmp.id) {
//      return 0;
//    } else if (this.id < anotherEmp.id) {
//      return -1;
//    } else {
//      return 1;
//    }

//    return this.id - anotherEmp.id;

//    return this.id.compareTo(anotherEmp.id); //работает только с Integer

    int result = this.name.compareTo(anotherEmp.name);
    if (result == 0) {
      result = this.surname.compareTo(anotherEmp.surname);
    }
    return result;
  }
}

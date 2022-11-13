package regex;

public class PrintFEx {

  static void employeeInfo(Employee emp) {
    //id - целые числа, длинна равна трем, слева дозаполняются нулями
    //name - тип данных string, длинна 12 символов, выравнивание по левому краю
    //.1 - округление до одного символа после запятой, запятая - разделитель разрядов в числах
    System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
        emp.id, emp.name, emp.surname, emp.salary*(1 + emp.bonusPct));
  }

  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Zaur", "Tregulov", 1111, 0.20);
    Employee emp2 = new Employee(15, "Ivan", "Petrov", 809, 0.10);
    Employee emp3 = new Employee(11, "Maria", "Lapshina", 754, 0.12);
    employeeInfo(emp1);
    employeeInfo(emp2);
    employeeInfo(emp3);

    String newFormat = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",
        1, "Zaur", "Tregulov", 1111*(1+0.20));
    System.out.println(newFormat);
  }

}

class Employee {
  int id;
  String name;
  String surname;
  int salary;
  double bonusPct;

  public Employee(int id, String name, String surname, int salary, double bonusPct) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
    this.bonusPct = bonusPct;
  }
}
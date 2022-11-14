package reflection_examples;

import java.lang.reflect.Field;


//как Рефлексия обходит инкапуляцию

public class Ex3 {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Employee employee = new Employee(10, "Zaur", "IT");
    Class empClass = employee.getClass();
    Field field = empClass.getDeclaredField("salary");
    field.setAccessible(true);//чтобы не поймать NoSuchFieldException
    double salaryValue = (Double) field.get(employee);
    System.out.println(salaryValue);

    field.set(employee, 1500);
    System.out.println(employee);
  }

}

package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Ex1 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
    Class employeeClass = Class.forName("reflection_examples.Employee");
//    Class employeeClass2 = Employee.class;
//    Employee employee = new Employee();
//    Class employeeClass3 = employee.getClass();

    Field someField = employeeClass.getField("id");
    System.out.println("Type of id field = " + someField.getType());
    System.out.println("-------------");

    Field[] fields = employeeClass.getFields();
    for (Field f : fields) {
      System.out.println("Type of " + f.getName() + " = " + f.getType());
    }
    System.out.println("-------------");

    Field[] allFields = employeeClass.getDeclaredFields();
    for (Field f : allFields) {
      System.out.println("Type of " + f.getName() + " = " + f.getType());
    }
    System.out.println("-------------");

    Method someMethod = employeeClass.getMethod("increaseSalary");
    System.out.println("Return type of increaseSalary = " + someMethod.getReturnType()
        + ", Parameter types = " + Arrays.toString(someMethod.getParameterTypes()));
    System.out.println("-------------");

    Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
    System.out.println("Return type of setSalary = " + someMethod2.getReturnType()
        + ", Parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
    System.out.println("-------------");

    Method[] methods = employeeClass.getMethods();
    for (Method method : methods) {
      System.out.println("Name of method = " + method.getName() +
          ", return type = " + method.getReturnType() +
          ", parameter types = " + Arrays.toString(method.getParameterTypes()));
    }
    System.out.println("-------------");

    Method[] allMethods = employeeClass.getDeclaredMethods();
    for (Method method : allMethods) {
      System.out.println("Name of method = " + method.getName() +
          ", return type = " + method.getReturnType() +
          ", parameter types = " + Arrays.toString(method.getParameterTypes()));
    }
    System.out.println("-------------");

    Method[] allMethods2 = employeeClass.getDeclaredMethods();
    for (Method method : allMethods2) {
      if (Modifier.isPublic(method.getModifiers())) {
        System.out.println("Name of method = " + method.getName() +
            ", return type = " + method.getReturnType() +
            ", parameter types = " + Arrays.toString(method.getParameterTypes()));
      }
    }
    System.out.println("-------------");

    Constructor constructor1 = employeeClass.getConstructor();
    System.out.println("Constructor has " + constructor1.getParameterCount() +
        " parameters, their types are: " +
        Arrays.toString(constructor1.getParameterTypes()));
    System.out.println("-------------");

    Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
    System.out.println("Constructor has " + constructor2.getParameterCount() +
        " parameters, their types are: " +
        Arrays.toString(constructor2.getParameterTypes()));
    System.out.println("-------------");

    Constructor[] allConstructors = employeeClass.getConstructors();
    for (Constructor c : allConstructors) {
      System.out.println("Constructor " + c.getName() + " has " + c.getParameterCount() +
          " parameters, their types are: " + Arrays.toString(c.getParameterTypes()));
    }
  }
}

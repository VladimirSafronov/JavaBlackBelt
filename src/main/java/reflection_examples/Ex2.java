package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {

  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Class empClass = Class.forName("reflection_examples.Employee");

//    Employee e = (Employee) empClass.newInstance();
//    System.out.println(e);

    Constructor<Employee> constructor1 = empClass.getConstructor();
    Employee obj = constructor1.newInstance();

    Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
    Object obj2 = constructor2.newInstance(5, "Zaur", "IT");
    System.out.println(obj2);

    Method method = empClass.getMethod("setSalary", double.class);
    method.invoke(obj2, 800.11);
    System.out.println(obj2);


  }
}

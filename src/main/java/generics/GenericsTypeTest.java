package generics;

public class GenericsTypeTest<T> {

  private T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static <T> boolean isEquals(GenericsTypeTest<T> t1, GenericsTypeTest<T> t2) {
    return t1.getT().equals(t2.getT());
  }

  public static void main(String[] args) {
    GenericsTypeTest<String> obj1 = new GenericsTypeTest<>();
    GenericsTypeTest<String> obj2 = new GenericsTypeTest<>();
    obj1.setT("1234");
    obj2.setT("1234");

    boolean isValuesEquals = GenericsTypeTest.isEquals(obj1, obj2);
    System.out.println(isValuesEquals);
  }
}

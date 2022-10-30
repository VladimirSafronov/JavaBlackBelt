package generics;

public class ParametrizedClass {
  public static void main(String[] args) {
    Info<String> info1 = new Info<>("word");
    System.out.println(info1);

    Info<Integer> info2 = new Info<>(5);
    System.out.println(info2);
  }
}

class Info<T> {
  T value;

  Info(T value) {
    this.value = value;
  }

  public String toString () {
    return "{[ " + value + " ]}";
  }
}

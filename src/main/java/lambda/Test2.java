package lambda;

public class Test2 {

  public static void def(I i) {
    System.out.println(i.abc("hello"));
  }

  public static void main(String[] args) {
    def( (String str) -> {return str.length() + 5;});
  }
}

interface I {
  int abc(String s);
}
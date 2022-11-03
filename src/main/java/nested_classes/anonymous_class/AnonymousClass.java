package nested_classes.anonymous_class;

public class AnonymousClass {
  private int d = 2;

  public static void main(String[] args) {
    //создается класс,который реализовывет интерфейс Math, и реализовывает его метод
    Math m = new Math() {
      int c = 10;

      public void someMethod() {
        System.out.println("класс имеет свои методы");
      }

      @Override
      public int doOperation(int a, int b) {
        someMethod();
        AnonymousClass an = new AnonymousClass();
        return a + b + an.d * c;
      }
    };
    System.out.println(m.doOperation(3, 6));
  }
}

interface Math {
  int doOperation(int a, int b);
}
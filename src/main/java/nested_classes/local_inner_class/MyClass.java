package nested_classes.local_inner_class;

public class MyClass {

  private final String name;
  private final int age;

  public MyClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void m() {
    System.out.println("into method m ");

    class MyLocalClass {
      final String copyName = name;
      final int copyAge = age;
      final int a = 1;
      final int b = 3;

      public int sum(int x, int y) {
        return x + y;
      }

      public void local() {
        System.out.println("Data in local: " + copyName + ", " + copyAge);
      }
    }
    MyLocalClass myLocalClass = new MyLocalClass();
    myLocalClass.local();
    System.out.println(myLocalClass.sum(myLocalClass.a, myLocalClass.b));
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass("Boris", 12);
    myClass.m();

  }
}

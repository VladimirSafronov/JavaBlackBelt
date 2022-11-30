package nested_classes.anonymous_class;

public class TestPrinter {

  public static void main(String[] args) {
    IPrinter printer = () -> System.out.println("Anonimouse text!");

    printer.printText();

    MyScanner scanner = new MyScanner("123abc");
    scanner.myMethod("Some text");
  }
}

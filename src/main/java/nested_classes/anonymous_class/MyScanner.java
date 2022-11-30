package nested_classes.anonymous_class;

public class MyScanner {

  String serialNumber;

  public MyScanner(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  protected void myMethod(String text) {
    IPrinter printer = () -> System.out.println("Serial number: " + serialNumber + " " + text);
    printer.printText();
  }
}

package nested_classes;

import nested_classes.Car.Engine;

public class Car {

  String color;
  int countDoors;
  Engine engine;
  private static int a;

  public Car(String color, int countDoors, Engine engine) {
    this.color = color;
    this.countDoors = countDoors;
    this.engine = engine;
  }

  //обращение ко всем переменным внутреннего класса возможно
  void method() {
    System.out.println(Engine.serialNumber);
    System.out.println(new Engine(150).power);
  }

  @Override
  public String toString() {
    return "My car: {" +
        "color='" + color + '\'' +
        ", countDoors=" + countDoors +
        ", engine=" + engine +
        '}';
  }

  public static class Engine {
    int power;
    private static int serialNumber = 0;

    public Engine(int power) {
      this.power = power;
      ++serialNumber;
      //обращение к переменным внешнего класса возможно,статичным напрямую, к нестатичным,используя объект
//      System.out.println(a);
//      System.out.println(new Car("white", 2, new Engine(100)).countDoors);
    }

    @Override
    public String toString() {
      return "My engine: {" +
          "power=" + power +
          '}';
    }
  }
}

//class Z extends Engine {
//
//  public Z(int power) {
//    super(power);
//  }
//}

//class Z{} //можно наследовать внутренний класс от него

class Test {

  public static void main(String[] args) {
    Car.Engine engine1 = new Engine(264);
    System.out.println(engine1);

    Car car1 = new Car("red", 4, engine1);
    System.out.println(car1);

  }
}

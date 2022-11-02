package inner_class;

import inner_class.Car.Engine;

public class Car {
  String color;
  int countDoors;
  Engine engine;

//  public Car(String color, int countDoors, int horsePower) {
//    this.color = color;
//    this.countDoors = countDoors;
//    this.engine = this.new Engine(horsePower);
//  }


  public Car(String color, int countDoors) {
    this.color = color;
    this.countDoors = countDoors;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "My car: {" +
        "color='" + color + '\'' +
        ", countDoors=" + countDoors +
        ", engine=" + engine +
        '}';
  }

  public class Engine {

    int power;

    public Engine(int power) {
      this.power = power;
    }

    @Override
    public String toString() {
      return "My engine: {" +
          "power=" + power +
          '}';
    }
  }
}

class Test {

  public static void main(String[] args) {
//    Car.Engine engine = new Car.Engine(150); //пример создания объекта nested static class

//    Car car = new Car("blue", 4, 200); //inner class создаем в конструкторе внешнего

    Car car = new Car("black", 2);
    Car.Engine engine = car.new Engine(250);
    car.setEngine(engine);
    System.out.println(car);
  }
}
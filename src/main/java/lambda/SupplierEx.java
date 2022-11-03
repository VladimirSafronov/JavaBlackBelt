package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {
  public static List<Car> getThreeCars(Supplier<Car> carSupplier) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      cars.add(carSupplier.get());
    }
    return cars;
  }

  public static void main(String[] args) {
    List<Car> cars = getThreeCars( () -> new Car("Ferrari", "red", 5.6));
    System.out.println(cars);
  }
}

class Car {
  String model;
  String color;
  double engine;

  public Car(String model, String color, double engine) {
    this.model = model;
    this.color = color;
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", engine=" + engine +
        '}';
  }
}
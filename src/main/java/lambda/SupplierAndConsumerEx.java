package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumerEx {

  public static List<Car> getThreeCars(Supplier<Car> carSupplier) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      cars.add(carSupplier.get());
    }
    return cars;
  }

  static void changeCar(Car car, Consumer<Car> carConsumer) {
    carConsumer.accept(car);
  }

  public static void main(String[] args) {
    List<Car> cars = getThreeCars(() -> new Car("Ferrari", "red", 5.6));
    System.out.println(cars);

    changeCar(cars.get(0), car -> {
      car.color = "white";
      car.engine = 6.6;
      System.out.println("upgrade car: " + car);
    });
    System.out.println(cars);

    List<String> dialog = List.of("Privet", "Kak dela?", "Otlichno", "Poka");
    dialog.forEach(str -> System.out.print(str + " "));

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.forEach(n -> {
      System.out.print(n + " * " + n + " = ");
      System.out.println(n * n);
    });
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
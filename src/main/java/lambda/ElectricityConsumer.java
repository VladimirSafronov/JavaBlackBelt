package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ElectricityConsumer {
  void electricityOn();
//  default void electricityOff() {}
}

class Switcher {
  private final List<ElectricityConsumer> listeners;

  public List<ElectricityConsumer> getListeners() {
    return listeners;
  }

  public Switcher() {
    this.listeners = new ArrayList<>();
  }

  void switchOn() {
    System.out.println("Switcher was on");
    for (ElectricityConsumer l : listeners) {
      l.electricityOn();
    }
  }

  void addListener(ElectricityConsumer consumer) {
    if(consumer != null && !listeners.contains(consumer)) {
      listeners.add(consumer);
    }
  }
  void removeListener(ElectricityConsumer consumer) {
    if(consumer != null) {
      listeners.remove(consumer);
    }
  }
}

class Lamp implements ElectricityConsumer {
  private void light() {
    System.out.println("lamp is shying");
  }

  @Override
  public void electricityOn() {
    light();
  }
}

class Radio implements ElectricityConsumer {
  private void radioOn() {
    System.out.println("Radio is playing");
  }

  @Override
  public void electricityOn() {
    radioOn();
  }
}

class ElectricityConsumerTest {

  private static void fire() {
    System.out.println("Fire!!");
  }

  public static void main(String[] args) {
    Switcher switcher = new Switcher();
    Lamp lamp = new Lamp();
    Radio radio = new Radio();
    switcher.addListener(lamp);
    switcher.addListener(radio);
    final String message = "Тушите свет!";

    switcher.addListener( () -> {
      System.out.println("Unnecessary device turning on");
      System.out.println(message);
    });

    switcher.addListener( ElectricityConsumerTest::fire );

    switcher.switchOn();
  }
}
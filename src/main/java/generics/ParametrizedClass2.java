package generics;

public class ParametrizedClass2 {

  public static void main(String[] args) {
    Pair<String, Integer> pair1 = new Pair<>("privet", 10);
    System.out.println("data in pair1: first value - " + pair1.getValue1() +
        " , second value - " + pair1.getValue2());

    Pair<Double, Integer> pair2 = new Pair<>(3.14, 15);
    System.out.println("data in pair2: first value - " + pair2.getValue1() +
        " , second value - " + pair2.getValue2());

    OtherPair<String> pair3 = new OtherPair<>("privet", "poka");
    System.out.println("data in pair3: first value - " + pair3.getValue1() +
        " , second value - " + pair3.getValue2());
  }
}
class Pair <V1, V2> {
  private V1 value1;
  private V2 value2;

  public Pair(V1 value1, V2 value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public V1 getValue1() {
    return value1;
  }

  public V2 getValue2() {
    return value2;
  }
}

class OtherPair <V> {
  private V value1;
  private V value2;

  public OtherPair(V value1, V value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public V getValue1() {
    return value1;
  }

  public V getValue2() {
    return value2;
  }
}

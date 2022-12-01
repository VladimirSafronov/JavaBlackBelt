package lambda;

@FunctionalInterface
public interface Generator {
  int getNextElement();
}

class SimpleGenerator {

  private int number;

  public SimpleGenerator(int number) {
    this.number = number;
  }

  public int getNumber() {
    return ++number;
  }

  public static int getRandomNumber() {
    return (int) (Math.random() * 10);
  }
}

class Test12 {

  public static void main(String[] args) {
    SimpleGenerator simpleGen = new SimpleGenerator(5);
    Generator gen = simpleGen::getNumber;
    int nextNumber = gen.getNextElement();
    System.out.println(nextNumber);

    Generator gen2 = SimpleGenerator::getRandomNumber;
    int randomNum = gen2.getNextElement();
    System.out.println(randomNum);
  }
}
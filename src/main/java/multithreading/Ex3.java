package multithreading;

public class Ex3 {

  public static void main(String[] args) {
    //создание потока при помощи анонимного класса
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    }).start();

    //создание потока при помощи лямбды
    new Thread(() -> System.out.println("hi")).start();
  }
}

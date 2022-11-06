package multithreading;

//пример почему не стоит запускать метод run() самостоятельно
public class Ex5 extends Thread {

  @Override
  public void run() {
    System.out.println("Method run. Thread name: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new Ex5());
    thread.run();
    System.out.println("Method main. Thread name: " + Thread.currentThread().getName());
  }
}

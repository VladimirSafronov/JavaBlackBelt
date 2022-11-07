package multithreading;

public class Ex9 {
  volatile static int counter = 0;
  static synchronized void increment() {counter++;}

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new R());
    Thread thread2 = new Thread(new R());
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    System.out.println("counter = " + counter);
  }
}

class R implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 20000; i++) {
      Ex9.increment();
    }
  }
}
package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

  static AtomicInteger count = new AtomicInteger();

  public static void increment() {
//    count.incrementAndGet();
    count.addAndGet(-2);
  }

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new MyClassImpl18());
    Thread thread2 = new Thread(new MyClassImpl18());
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
    System.out.println(count);
  }
}

class MyClassImpl18 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100000; i++) {
      AtomicIntegerEx.increment();
    }
  }
}
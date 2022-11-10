package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
  static CountDownLatch countDownLatch = new CountDownLatch(3);

  private static void comeToWork() throws InterruptedException {
    Thread.sleep(2000);
    System.out.println("All staff came to work");
    countDownLatch.countDown();
    System.out.println("countDownLatch = " + countDownLatch.getCount());
  }

  private static void readyToWork() throws InterruptedException {
    Thread.sleep(3000);
    System.out.println("All products on shelves");
    countDownLatch.countDown();
    System.out.println("countDownLatch = " + countDownLatch.getCount());
  }

  private static void openShop() throws InterruptedException {
    Thread.sleep(4000);
    System.out.println("Shop opened");
    countDownLatch.countDown();
    System.out.println("countDownLatch = " + countDownLatch.getCount());
  }

  public static void main(String[] args) throws InterruptedException {
    new Customer("Zaur", countDownLatch);
    new Customer("Elena", countDownLatch);
    new Customer("Marina", countDownLatch);
    new Customer("Oleg", countDownLatch);
    new Customer("Bob", countDownLatch);

    comeToWork();
    readyToWork();
    openShop();
  }
}

class Customer extends Thread {
  String name;
  CountDownLatch countDownLatch;

  public Customer(String name, CountDownLatch countDownLatch) {
    this.name = name;
    this.countDownLatch = countDownLatch;
    this.start();
  }

  public void run() {
    try {
      countDownLatch.await();
      System.out.println(name + " enjoying shopping");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
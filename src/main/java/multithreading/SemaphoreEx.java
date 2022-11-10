package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

  public static void main(String[] args) {
    Semaphore callBox = new Semaphore(2);
    Person person1 = new Person("Zaur", callBox);
    Person person2 = new Person("Andrey", callBox);
    Person person3 = new Person("Anny", callBox);
    Person person4 = new Person("Bob", callBox);
    Person person5 = new Person("Margaret", callBox);
  }
}

class Person extends Thread {
  String name;
  private Semaphore semaphore;

  public Person(String name, Semaphore semaphore) {
    this.name = name;
    this.semaphore = semaphore;
    this.start();
  }

  public void run() {
    try {
      System.out.println(name + " waiting for...");
      semaphore.acquire();
      System.out.println(name + " are using telephone");
      sleep(2000);
      System.out.println(name + " ended phone call");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      semaphore.release();
    }
  }
}
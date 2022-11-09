package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

  public static void main(String[] args) throws InterruptedException {
    Lock lock = new ReentrantLock();
    Employee employee = new Employee("Zaur", lock);
    Employee employee1 = new Employee("Andrey", lock);
    Employee employee2 = new Employee("Vladimir", lock);
    Thread.sleep(5000);
    Employee employee3 = new Employee("Misha", lock);
    Employee employee4 = new Employee("Kirill", lock);
  }
}

class Employee extends Thread {
  String name;
  private Lock lock;

  public Employee(String name, Lock lock) {
    this.name = name;
    this.lock = lock;
    this.start();
  }

  @Override
  public void run() {
    if (lock.tryLock()) {
      try {
//      System.out.println(name + " waiting...");
//      lock.lock();
        System.out.println(name + " are using bankomat");
        Thread.sleep(2000);
        System.out.println(name + " ended to use bankomat");
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        lock.unlock();
      }
    } else {
      System.out.println(name + " doesn't want to stay in queue");
    }
  }
}
package multithreading;


public class Ex6 extends Thread {

  @Override
  public void run() {
    for (int i = 1; i < 5; i++) {
      try {
        sleep(1000);
        System.out.println(Thread.currentThread().getName() + ": " + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Ex6 thread = new Ex6();
    Thread thread2 = new Thread(new MyRunnable());
    thread.start();
    thread2.start();
    thread.join();
    thread2.join();

    System.out.println("End!!!");
  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + ": " + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
package multithreading;

public class SynchronizedBlock1 {

  public static void main(String[] args) {
    MyRunneable3 myRun = new MyRunneable3();
    Thread thread1 = new Thread(myRun);
    Thread thread2 = new Thread(myRun);
    Thread thread3 = new Thread(myRun);
    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class Count2 {
  volatile static int counter = 0;
}

class MyRunneable3 implements Runnable {

  private void doWork2() {
    System.out.println("!!");
  }

  private void doWork1() {
    doWork2();
    synchronized (this) {
      Count2.counter++;
      System.out.println(Count2.counter);
    }
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      doWork1();
    }
  }
}

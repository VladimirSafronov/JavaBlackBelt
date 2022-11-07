package multithreading;

public class Ex8 {

  public static void main(String[] args) {
    MyRunneable2 myRun = new MyRunneable2();
    Thread thread1 = new Thread(myRun);
    Thread thread2 = new Thread(myRun);
    Thread thread3 = new Thread(myRun);
    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class Count {
  volatile static int counter = 0;
}

class MyRunneable2 implements Runnable {

  public synchronized void increment() {
    Count.counter++;
    System.out.print(Count.counter + " ");
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      increment();
    }
  }
}
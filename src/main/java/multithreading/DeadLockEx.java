package multithreading;

public class DeadLockEx {
  final static Object lock1 = new Object();
  final static Object lock2 = new Object();

  public static void main(String[] args) {
    Thread10 thread10 = new Thread10();
    Thread20 thread20 = new Thread20();
    thread10.start();
    thread20.start();
  }
}
class Thread10 extends Thread {

  @Override
  public void run() {
    System.out.println("Thread10: try to catch lock1");
    synchronized (DeadLockEx.lock1) {
      System.out.println("Thread10: lock1 was caught");
      System.out.println("Thread10: try to catch lock2");
      synchronized (DeadLockEx.lock2) {
        System.out.println("Thread10: lock2 and lock1 were caught");
      }
    }
  }
}

//чтобы не возникло DeadLock, в методе run обоих потоков нужно прописать одинаковый порядок захвата
//мониторов объектов
class Thread20 extends Thread {

  @Override
  public void run() {
    System.out.println("Thread20: try to catch lock2");
    synchronized (DeadLockEx.lock2) {
      System.out.println("Thread20: lock2 was caught");
      System.out.println("Thread20: try to catch lock1");
      synchronized (DeadLockEx.lock1) {
        System.out.println("Thread20: lock2 and lock1 were caught");
      }
    }
  }
}
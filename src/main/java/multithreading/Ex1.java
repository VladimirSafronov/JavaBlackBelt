package multithreading;

public class Ex1 extends Thread {

  public void run() {
    for (int i = 1; i <= 1000; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {

    Ex1 thread3 = new Ex1();
    thread3.start();

    for (int i = 1000; i > 0; i--) {
      System.out.println(i);
    }

//    MyThread thread1 = new MyThread();
//    MyThread2 thread2 = new MyThread2();
//    thread1.start();
//    thread2.start();
  }
}

//class MyThread extends Thread {
//  public void run() {
//    for (int i = 1; i <= 1000; i++) {
//      System.out.println(i);
//    }
//  }
//}
//
//class MyThread2 extends Thread {
//  public void run() {
//    for (int i = 1000; i > 0; i--) {
//      System.out.println(i);
//    }
//  }
//}
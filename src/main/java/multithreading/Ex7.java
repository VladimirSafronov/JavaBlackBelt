package multithreading;

public class Ex7 {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Method main starts");
    Thread thread = new Thread(new Worker());
    System.out.println(thread.getState());
    thread.start();
    System.out.println(thread.getState());
    thread.join();
//    thread.join(1500);
    System.out.println(thread.getState());
    System.out.println("Method main ends");
  }
}

class Worker implements Runnable {
  @Override
  public void run() {
    System.out.println("Work starts");
    try {
      Thread.sleep(2500);
      System.out.println("Work ends");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
package multithreading;

public class InterruptEx {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Method main starts");
    InterruptedThread thread = new InterruptedThread();
    thread.start();
    Thread.sleep(2000);
    thread.interrupt();
    thread.join();
    System.out.println("Method main ends");
  }
}

class InterruptedThread extends Thread {

  double sqrtSum = 0;

  public void run() {
    for (int i = 1; i < 1000000000; i++) {
      if (isInterrupted()) {
        System.out.println("Somebody wants to interrupt thread.");
        System.out.println(
            "We made sure that the state of all objects is normal. And decided to stop thread.");
        System.out.println(sqrtSum);
        return;
      }
      try {
        sleep(200);
      } catch (InterruptedException e) {
        System.out.println("Somebody wants to interrupt the thread during sleep. Let's do it.");
        System.out.println(sqrtSum);
        return;
      }
      sqrtSum += Math.sqrt(i);
    }
    System.out.println(sqrtSum);
  }
}
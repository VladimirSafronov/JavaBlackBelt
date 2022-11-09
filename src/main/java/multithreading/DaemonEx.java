package multithreading;

public class DaemonEx {

  public static void main(String[] args) {
    System.out.println("Method main starts");
    UserThread userThread = new UserThread();
    userThread.setName("user_thread");
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setName("daemon_thread");
    daemonThread.setDaemon(true);
    userThread.start();
    daemonThread.start();
    System.out.println("Method main ends");
  }
}

class UserThread extends Thread {
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
    for (char i = 'A'; i < 'H'; i++) {
      try {
        sleep(300);
        System.out.println(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class DaemonThread extends Thread {
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
    for (int i = 1; i <= 1000; i++) {
      try {
        sleep(100);
        System.out.println(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
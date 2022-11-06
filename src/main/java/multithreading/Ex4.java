package multithreading;

public class Ex4 {

  public static void main(String[] args) {
    Thread thread = new Thread(new MyThread());
    System.out.println("thread name is: " + thread.getName() + " priority is: " + thread.getPriority());
    Thread thread1 = new Thread(new MyThread());
    thread1.setName("myNameIsSuperThread");
    thread1.setPriority(Thread.MAX_PRIORITY);
    System.out.println("thread1 name is: " + thread1.getName() + " priority is: " + thread1.getPriority());
  }
}

class MyThread implements Runnable {
  @Override
  public void run() {
    System.out.println("hello");
  }
}
package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {

  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

//    scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);

//    scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 2, 5, TimeUnit.SECONDS);

    scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 2, TimeUnit.SECONDS);

    ExecutorService executorService = Executors.newCachedThreadPool();

    Thread.sleep(20000);
    scheduledExecutorService.shutdown();
  }
}

class RunnableImpl200 implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " begins work");
//    try {
//      Thread.sleep(500);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    System.out.println(Thread.currentThread().getName() + " ends work");
  }
}
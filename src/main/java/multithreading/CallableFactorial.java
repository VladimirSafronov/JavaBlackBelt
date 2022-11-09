package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFactorial {
  static int resultFact;

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<Integer> future = executorService.submit(new Factorial2(6));
    try {
      System.out.println(future.isDone());
      System.out.println("Want to get result ...");
      resultFact = future.get();
      System.out.println("Got result!");
      System.out.println(future.isDone());
    } catch (InterruptedException | ExecutionException e) {
      System.out.println(e.getCause());
    } finally {
      executorService.shutdown();
    }
    System.out.println(resultFact);
  }
}

class Factorial2 implements Callable<Integer> {
  int f;

  public Factorial2(int f) {
    this.f = f;
  }

  @Override
  public Integer call() throws Exception {
    if(f <= 0) {
      throw new Exception("Your number is uncorrected");
    }
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result *= i;
      Thread.sleep(1000); //чтобы проследить как метод get() блокирует поток
    }
    return result;
  }
}
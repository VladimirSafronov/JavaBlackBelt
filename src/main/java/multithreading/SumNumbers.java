package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {

  private static long sum = 0;
  private static long value = 1_000_000_000L;

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    List<Future<Long>> futureList = new ArrayList<>();
    long valueDevidedBy10 = value / 10;
    for (int i = 0; i < 10; i++) {
      long from = valueDevidedBy10 * i + 1;
      long to = valueDevidedBy10 * (i + 1);
      PartialSum task = new PartialSum(from, to);
      Future<Long> futurePartSum = executorService.submit(task);
      futureList.add(futurePartSum);
    }
    for(Future<Long> future : futureList) {
      sum += future.get();
    }
    executorService.shutdown();
    System.out.println("Total sum = " + sum);
  }
}

class PartialSum implements Callable<Long> {

  long from;
  long to;
  long localSum;

  public PartialSum(long from, long to) {
    this.from = from;
    this.to = to;
  }

  @Override
  public Long call() {
    for (long i = from; i <= to; i++) {
      localSum += i;
    }
    System.out.println("sum from " + from + " to " + to + " = " + localSum);
    return localSum;
  }
}
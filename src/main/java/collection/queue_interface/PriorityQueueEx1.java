package collection.queue_interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {

  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(1);
    pq.add(10);
    pq.add(8);
    pq.add(3);
    pq.add(5);
    //1, 3, 5, 8, 10
    System.out.println(pq); //при выводе на экран,сортировка почему-то не работает
    System.out.println(pq.remove()); //но при работе с очередью, все как надо
    System.out.println(pq.remove());
    System.out.println(pq.remove());
    System.out.println(pq);
  }
}

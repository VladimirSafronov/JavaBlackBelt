package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addFirst(22);
    deque.addLast(13);
    deque.offerFirst(0);
    deque.offerLast(44);
    System.out.println(deque);
    System.out.println(deque.removeFirst());
    System.out.println(deque.removeLast());
    System.out.println(deque.pollFirst());
    System.out.println(deque.pollLast());
    System.out.println(deque);
    System.out.println(deque.getFirst());
    System.out.println(deque.peekLast());
  }
}

package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("Zaur");
    queue.add("Makar");
    queue.add("Oleg");
    queue.add("Ivan");
    queue.offer("Natasha");
    System.out.println(queue);
    System.out.println(queue.remove());
    System.out.println(queue);
    System.out.println(queue.element()); //возвращает первый элемент
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
//    System.out.println(queue.remove()); //при пустой очереди NoSuchElementException
    System.out.println(queue.poll()); //не бросит Exception, вернув null
  }
}

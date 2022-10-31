package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

  public static void main(String[] args) {
    String s = "madama";
    List<Character> list = new LinkedList<>();
    for (Character ch : s.toCharArray()) {
      list.add(ch);
    }
    ListIterator<Character> startIterator = list.listIterator();
    ListIterator<Character> endIterator = list.listIterator(list.size());
    boolean isPalindrome = true;
    int middle = s.length() / 2;
    while (startIterator.hasNext() && endIterator.hasPrevious() && middle > 0) {
      if (startIterator.next() != endIterator.previous()) {
        isPalindrome = false;
        break;
      }
      middle--;
    }
    if (isPalindrome) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not palindrome");
    }
  }
}

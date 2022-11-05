package streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

  public static void main(String[] args) {
    List<Double> list = new ArrayList<>();
    list.add(10.0);
    list.add(5.0);
    list.add(1.0);
    list.add(0.25);

//    double sumElements = list.parallelStream().reduce((accum, elem) -> accum + elem).get();
//    System.out.println(sumElements);

    //в данном примере параллельные стримы не будут корректно работать
    double minElements = list.parallelStream().reduce((accum, elem) -> accum - elem).get();
    System.out.println(minElements);
  }
}

package streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Test5 {

  public static void main(String[] args) {
    int[] numbers = {3, 81, 100, 6, -10, 44, 33, 12, 35, 76, 1, 0};
//    int[] sortedNumbers = Arrays.stream(numbers)
//        .sorted().toArray();
//    System.out.println(Arrays.toString(sortedNumbers));

    OptionalInt optional = Arrays.stream(numbers).filter( n -> n % 2 != 0)
        .map( n -> {if (n % 3 == 0) {n /= 3;} return n;})
        .reduce( (ac, el) -> ac + el);
    int ans = 0;
    if (optional.isPresent()) {
      ans = optional.getAsInt();
    }
    //1, 27, 11, 35, 1
    System.out.println(ans);
  }
}

package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

  public static void main(String[] args) {
    String myString = "25496820176839501118465;" +
        "10978465832517460920367;" +
        "09826581234548951025234";
    // 11/18 2549 6820 1768 3950 (465)

    //каждая группа распологается внутри круглях скобок
    Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
    Matcher matcher = pattern.matcher(myString);
//    String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//    System.out.println(myNewString);

    while (matcher.find()) {
      System.out.println(matcher.group(7));//без аргумента выводит все группы, в арг-те указываем номер группы
    }
  }
}

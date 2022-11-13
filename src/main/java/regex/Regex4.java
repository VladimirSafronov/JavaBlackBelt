package regex;

import java.util.regex.Pattern;

public class Regex4 {
  void checkIP(String ip) {
    String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
    System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
  }

  public static void main(String[] args) {
    //0-255.0-255.0-255.0-255
    String s1 = "255.38.200.134";
    String s2 = "255.338.200.134";

    Regex4 obj = new Regex4();
    obj.checkIP(s1);
    obj.checkIP(s2);
  }
}

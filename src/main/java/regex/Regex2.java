package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

  public static void main(String[] args) {
//    String s1 = "ABCD ABCE ABCFABCGABCH";
//    Pattern pattern = Pattern.compile("ABC");

//    String s1 = "ABCD ABCE ABCFABCGABCH";
//    Pattern pattern = Pattern.compile("[ABC]");

//    String s1 = "ABCOPABDOP";
//    Pattern pattern = Pattern.compile("AB[C-F]OP");

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("abc[e-g4-7]");//e-g и 4-7 (два диапазона)

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("abc(e|5)");

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("abc.");//. - любой символ,кроме символа новой строки

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("bch$");// является ли выражение концом строки; ˆ - началом

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("\\d");//любые цифры

//    String s1 = "abcd abce abc5abcg6abch";
//    Pattern pattern = Pattern.compile("\\W");//любые не буквы,не цифры и не _

//    String s1 = "abcd ab!ce ==--abcabc5abcg6abch";
//    Pattern pattern = Pattern.compile("\\W+");//выражение и любое количество подходящих символов после

    String s1 = "abcd privet poka Boby abstrakcionizm";
    Pattern pattern = Pattern.compile("\\w{4}");//в скобках указывается количество символов,для шаблона
    Matcher matcher = pattern.matcher(s1);

    while (matcher.find()) {
      System.out.println("Position: " + matcher.start() + "     " + matcher.group());
    }
  }
}

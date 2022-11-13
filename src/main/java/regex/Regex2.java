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

//    String s1 = "abcd privet poka Boby abstrakcionizm";
//    Pattern pattern = Pattern.compile("\\w{4}");//в скобках указывается количество символов,для шаблона

//    String s1 = "abcd    privet   poka  Boby   abstrakcionizm";
//    Pattern pattern = Pattern.compile("\\w\\s+\\w");//пробелы, и по одному символу на границе

//    String s1 = "abcd pri4vet oka44jdbgh";
//    Pattern pattern = Pattern.compile("\\D{2,6}");//не цифры от 2 до 6 символов

//    String s1 = "abcd pri4vet oka44jdbgh";
//    Pattern pattern = Pattern.compile("\\D{2,}");//не цифры от 2

//    String s1 = "ABCABABAD";
//    Pattern pattern = Pattern.compile("(AB){2}");//чтобы было соответствие по нескольким символам, нужно заключить в круглые скобки

//    String s1 = "DABCDABABADABABABABW";
//    Pattern pattern = Pattern.compile("D(AB){2,}");//D + AB (от 2 и более раз)

//    String s1 = "DABCDABABADABABABABDW";
//    Pattern pattern = Pattern.compile("D(AB)?");
//    Pattern pattern = Pattern.compile("D(AB)*");

//    String s1 = "abcd abce4 afc467ghjk";
//    Pattern pattern = Pattern.compile("\\Aabcd");//является ли abcd началом String
//    Pattern pattern = Pattern.compile("hjk\\Z");//является ли abcd концом String

    String s1 = "abcd abce4 afc467ghjk";
    Pattern pattern = Pattern.compile("[abcd][cd4-8]");//2 символа
    Matcher matcher = pattern.matcher(s1);

    while (matcher.find()) {
      System.out.println("Position: " + matcher.start() + "     " + matcher.group());
    }
  }
}

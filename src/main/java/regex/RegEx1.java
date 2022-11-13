package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

  public static void main(String[] args) {
    String s = "Ivanov Vasilii, Russia, Moscow, Lenin street, 51, Flat 48," +
        " email:vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
        "Petrova Maria, Ukraine, Kyiv, Lomonosov street, 33, Flat 18," +
        " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
        "Chak Norris, USA, Hollywood, All stars street, 87, flat 21," +
        " email: chak@gmail.com, Postcode: USA23, Phone Number: +125478939";

//    Pattern pattern = Pattern.compile("\\w+");
//    Pattern pattern = Pattern.compile("\\b\\d{2}\\b");//только выражения из двух цифр
//    Pattern pattern = Pattern.compile("\\+\\d{9}");//номера телефонов
    Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");//emails
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}

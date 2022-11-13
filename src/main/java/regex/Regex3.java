package regex;

import java.util.Arrays;

public class Regex3 {

  public static void main(String[] args) {

    String s = "Ivanov Vasilii, Russia, Moscow, Lenin street, 51, Flat 48," +
        " email:vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
        "Petrova Maria, Ukraine, Kyiv, Lomonosov street, 33, Flat 18," +
        " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
        "Chak Norris, USA, Hollywood, All stars street, 87, flat 21," +
        " email: chak@gmail.com, Postcode: USA23, Phone Number: +125478939";

    String s2 = "chak@gmail.com";
    boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
    System.out.println(result);
    String[] array = s.split(" ");
    System.out.println(Arrays.toString(array));
  }

}

package enums;

import java.util.Arrays;

public class Enum1 {

  public static void main(String[] args) {
    Today today = new Today(WeekDay.SUNDAY);
    today.dayInfo();

    WeekDay w1 = WeekDay.valueOf("TUESDAY");
    System.out.println(w1);

    WeekDay[] allDays = WeekDay.values();
    System.out.println(Arrays.toString(allDays));
  }

}

enum WeekDay {
  MONDAY("bad"),
  TUESDAY("bad"),
  WEDNESDAY("so-so"),
  THURSDAY("so-so"),
  FRIDAY("good"),
  SATURDAY("great"),
  SUNDAY("good");

  private String mood;

  private WeekDay(String mood) {
    this.mood = mood;
  }

  public String getMood() {
    return mood;
  }
}

class Today {
  WeekDay weekDay;

  public Today(WeekDay weekDay) {
    this.weekDay = weekDay;
  }

  public void dayInfo() {
    switch (weekDay) {
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
      case THURSDAY:
      case FRIDAY:
        System.out.println("Go to work!");
        break;
      case SATURDAY:
      case SUNDAY:
        System.out.println("You may get relax!");
        break;
    }
    System.out.println("The mood today is " + weekDay.getMood());
  }
}
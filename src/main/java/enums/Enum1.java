package enums;

public class Enum1 {

  public static void main(String[] args) {
    Today today = new Today(WeekDay.MONDAY);
    today.dayInfo();
  }

}

enum WeekDay {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
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
  }
}
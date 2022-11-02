package nested_classes.local_inner_class;

public class LocalInner1 {

  public static void main(String[] args) {
    Math math = new Math();
    math.getResult(21, 4);
  }
}

class Math {

  private String str = "secret code";
  public void getResult(final int delimoe, final int delitel) {
//    int delimoe = 21;
//    delimoe = 20; //уже не будет effectively final

    class Delenie {
//      private int delimoe;
//      private int delitel;

//      public int getDelimoe() {
//        return delimoe;
//      }
//
//      public void setDelimoe(int delimoe) {
//        this.delimoe = delimoe;
//      }
//
//      public int getDelitel() {
//        return delitel;
//      }
//
//      public void setDelitel(int delitel) {
//        this.delitel = delitel;
//      }

      public int getChastnoe() {
        return delimoe / delitel;
      }

      public int getOstatok() {
        System.out.println(str);
        return delimoe % delitel;
      }
    }

    Delenie delenie = new Delenie();
//    delenie.setDelitel(4);
//    delenie.setDelimoe(21);
    System.out.println("Delimoe = " +delimoe);
    System.out.println("Delitel = " +delitel);
    System.out.println("Chastnoe = " +delenie.getChastnoe());
    System.out.println("Ostatok = " +delenie.getOstatok());
  }
}
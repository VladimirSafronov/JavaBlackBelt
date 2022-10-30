package generics;

public class Subtyping {
  public static void main(String[] args) {

    //String не является наследником Number
//    InfoWild<String> info1 = new InfoWild<>("word");
//    System.out.println(info1);

//    InfoWild<Integer> info2 = new InfoWild<>(5);
//    System.out.println(info2);
//
//    InfoWild<Double> info3 = new InfoWild<>(3.14);
//    System.out.println(info3);
  }
}

//правило написания для дженерика который и наследуется и имплементирует интерфейсы
class InfoWild<T extends Number & I1 & I2> {
  T value;

  InfoWild(T value) {
    this.value = value;
  }

  public String toString () {
    return "{[ " + value + " ]}";
  }
}

interface I1{}
interface I2{}
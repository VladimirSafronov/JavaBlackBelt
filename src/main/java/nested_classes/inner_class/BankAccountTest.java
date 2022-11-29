package nested_classes.inner_class;

public class BankAccountTest {

  public static void main(String[] args) {
    BankAccount vtbAccount = new BankAccount("123abc", "Viktor");
    final BankAccount.Card salaryCard = vtbAccount.new Card("1111222233334444");

    vtbAccount.setAmount(1000);
    System.out.println(vtbAccount.getAmount());
    System.out.println(salaryCard.withdraw(200));
    System.out.println(vtbAccount.getAmount());
  }
}

package nested_classes.inner_class;

public class BankAccount {

  private double amount;
  private final String number;
  private final String owner;

  public BankAccount(String number, String owner) {
    this.number = number;
    this.owner = owner;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getNumber() {
    return number;
  }

  public String getOwner() {
    return owner;
  }

  private synchronized double withdraw(double amountToWithdraw) {
    if (getAmount() == 0) {
      return 0;
    }
    if (amountToWithdraw > getAmount()) {
      final double amountToReturn = getAmount();
      amount = 0;
      return amountToReturn;
    }
    this.amount = this.amount - amountToWithdraw;
    return amountToWithdraw;
  }

  public class Card {

    private final String number;

    public Card(String number) {
      this.number = number;
    }

    public String getNumber() {
      return number;
    }

    public double withdraw(double amountToWithdraw) {
      return BankAccount.this.withdraw(amountToWithdraw);
    }
  }
}

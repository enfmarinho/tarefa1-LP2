public class Account {
  private String id;
  private String name;
  private int balance = 0;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
    this.balance = 0;
  }

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public int credit(int credit) {
    balance += credit;
    return balance;
  }

  public int debit(int debit) {
    if (balance >= debit) {
      balance -= debit;
    } else {
      System.out.println("Amound exceeded balance");
    }
    return balance;
  }

  public int transferTo(Account another, int amount) {
    if (balance >= amount) {
      balance -= amount;
      another.balance += amount;
    } else {
      System.out.println("Amound exceeded balance");
    }
    return balance;
  }

  public String toString() {
    return "Account[id=" + id +",name=" + name + ",balance=" + balance + "]";
  }
}


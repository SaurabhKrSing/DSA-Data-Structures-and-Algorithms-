// package code.object_oriented_programming;

public class Access_modifiers_1 {
  public static void main(String[] args) {

    BankAccount account = new BankAccount();
    account.name = "System";
    // account.password = "123";
    System.out.println(account.name);

  }
}

class BankAccount {
  public String name;
  // private String password;

  // public void setPassword(String pass) {
  // password = pass;
  // }

}

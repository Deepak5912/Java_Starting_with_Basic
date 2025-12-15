package three.abstraction;

 public class Current_Account extends BankAccount {

     public Current_Account(int account_Number, double balance) {
         super(account_Number, balance);
     }

     @Override
     public void withdraw(double amount) {
         System.out.println("withdraw from current account " + amount);
     }

     @Override
     public void deposit(double amount) {
         System.out.println("deposit in current account "+ amount);

     }
 }

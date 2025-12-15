package three.abstraction;

public class Saving_Account extends BankAccount{


    public Saving_Account(int account_Number, double balance) {
        super(account_Number, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("money withdrawn from saving account  " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("money deposited in saving account  " + amount);

    }
}

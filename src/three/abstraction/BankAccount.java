package three.abstraction;

abstract class BankAccount {
    private int Account_Number;
    private double balance;
    private double amount;

    abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(int account_Number) {
        Account_Number = account_Number;
    }



    // constructor


    public BankAccount(int account_Number, double balance) {
        this.Account_Number = account_Number;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Your current account balance is: " + this.balance);


    }

}

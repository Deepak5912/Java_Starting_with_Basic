package three.abstraction;

public class AbstarctionDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        Saving_Account SA = new Saving_Account(747488282, 20000000);
        SA.withdraw(300);
        SA.deposit(500);
        SA.checkBalance();
        System.out.println(SA.getAccount_Number());



        Current_Account CA = new Current_Account(75497434, 2342334);
        CA.withdraw(600);
        CA.deposit(899);
        System.out.println(CA.getBalance());
    }
}

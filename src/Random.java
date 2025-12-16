import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        String all = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+=<>?/.,:;{}|~`";
        int length = 10;
        String password = "";
        // Use java.util.Random explicitly to avoid conflict with the class name 'Random'
        java.util.Random rand = new java.util.Random();

        for(int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(all.length());
            password += all.charAt(randomIndex);
        }
        System.out.println(password);
    }
}

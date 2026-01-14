package Day9;

import java.util.Scanner;

public class MethodInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no.");
        int a = sc.nextInt();
        System.out.println("enter the second no.");
        int b = sc.nextInt();
        sum(a, b);
        sc.close();
    }
// quewtion :- take a input of two nubers and print their sum using method.
    static void sum(int a, int b) {
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}

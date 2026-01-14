package basic_Revision;

import java.util.Scanner;

public class chall3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no. ");
        int b = sc.nextInt();
        System.out.println("Addition of twon no. ");
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + "); is: " + result);
        result = a - b;
        System.out.println("The subtraction of " + a + " and " + b + "); is: " + result);
        result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + ");; is: " + result);
        result = a / b;
        System.out.println("The division of " + a + " and " + b + "is : " + result);

    }
}

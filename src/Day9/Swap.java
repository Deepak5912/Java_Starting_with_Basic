package Day9;

public class Swap {
    static void main() {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // Swapping logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

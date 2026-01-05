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
        swap(50,60);

    }
    static void  swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println("After Swap Method Call: a = " + c + ", b = " + d);

    }
}

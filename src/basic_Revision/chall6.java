package basic_Revision;

public class chall6 {
    static void main() {
        int i = 1;
        int n = 10;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
               // System.out.println("the even no. are : " + i);
            } else {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

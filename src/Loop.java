public class Loop {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        for (int i = 0; i < a ; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        int result = sum;
        System.out.println(result);
    }
}

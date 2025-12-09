public class Average {
    public static void main(String[] args) {
        int avg , sum  = 10;
        int [] arr1 = {10,5,6,7,123,150};
        int length  = arr1.length;
        for (int i = 0; i < length; i++) {
            sum = sum + arr1[i];

        }
        avg = sum / length;
        System.out.println(sum);
        System.out.println(avg);
    }
}

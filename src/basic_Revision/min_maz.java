package basic_Revision;

public class min_maz {
    static void main() {
        int[] arr = {4, 5, 1, 8, 9};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}

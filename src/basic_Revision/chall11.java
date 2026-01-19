package basic_Revision;

public class chall11 {
    static void main() {
        int[] arr = {3, 5, 2, 4, 6};
        int del = 4;
        int n = arr.length;
        int[] newArr = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != del) {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int k = 0; k < newArr.length; k++) {
            System.out.println(newArr[k]);
        }
    }
}

package basic_Revision;

import java.util.Scanner;

public class chall8 {
    static void main() {
        int sum = 0;
        int avg = 0;

        int[] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 elements of array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("The elements of array are : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            sum = sum+arr1[i];

        }
        System.out.println("The sum of array elements is : " + sum);
        avg = sum/arr1.length;
        System.out.println("The average of array elements is : " + avg);

    }
}

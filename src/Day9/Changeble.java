package Day9;

import java.util.Arrays;

public class Changeble {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5};
        changeArray(arr);
        System.out.print("After changeArray method call: " + Arrays.toString(arr));
    }
    static void changeArray(int [] nums ){
        nums[0] =  100;
    }
}

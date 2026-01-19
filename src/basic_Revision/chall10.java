package basic_Revision;

public class chall10 {
    static void main() {
        int [] arr1  = {1,5,6,7,9,10,15};
        System.out.println(arr1.length);
        for(int i = 0; i< arr1.length-1; i++){
            System.out.println("the element at index " + i + " is : " + arr1[i]);
            if (arr1[i]<arr1[i+1]){
                continue;
            }
            else {
                System.out.println("array is not sorted");
                return;
            }
        }
        System.out.println("array are sorted");

    }
}

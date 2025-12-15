public class SearcElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 34, 67, 43, 23, 13, 35, 34, 56, 78, 90};
        int searckey = 34;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searckey) {
                System.out.println("element found at index no :  " + i);
                count++;
                if (count == 1){
                    break;
                }
            }

        }

        if (count == 0) {
            System.out.println("element not found");
        } else {
            System.out.println("total number of element found are : " + count);
        }
    }
}

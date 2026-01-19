package basic_Revision;

public class ArrPracitice {
    public static void main(String [] args ){
        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int[][] arr2 = new int [5][3];
        System.out.println(arr2.length);
        System.out.println(arr1.length);

        // traversing 2D array using  loop
        int i = 0;
        while(i<arr1.length){
            int j = 0;
            while(j<arr1[i].length){
                System.out.print(arr1[i][j] + " ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}

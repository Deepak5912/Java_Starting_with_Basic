package basic_Revision;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("This is Ex1 class in basic_Revision package.");
        int n = 10;
        for(int i = 1; i<n; i++){
            for(int j = i; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

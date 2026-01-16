package basic_Revision;

public class chall7 {
    public static void main(String [] args){
        int n  = 120;
        System.out.println("The factorial of " + n + " is: " + factorial(n));

    }public static long factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
            //sout
        }
    }
}

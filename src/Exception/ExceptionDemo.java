package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 190;
//        System.out.println("the value of a is :"+ a);
//        int c  = a/0;
//        System.out.println("the value of c is :"+ c);
//
        // generating \some eroor above code : exceptoion handling


        try {
            int result =   a/0;
            System.out.println("the value of result is :"+ result);
        } catch (Exception e) {
            System.out.println("error occured :"+ e.getMessage());
        }


        int  [] arr1 = {1,2,3,4,5};
        try {
            System.out.println(arr1[6]);
            System.out.println("get the error ");
        } catch (Exception e){
            System.out.println("error occured for out of bound" );
        }
        finally {
            System.out.println("this block will always execute ");
        }

    }
}

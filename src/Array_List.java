import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList <String> Cars = new ArrayList <String> ();
        Cars.add("Volvo");
        Cars.add("Ford");
        Cars.add("BMW");
        Cars.add("Ford");
        Cars.add("Audi");
        for(String car : Cars){
            System.out.println(car);
        }

        System.out.println(" ******************************************** ");

        Cars.remove("Audi");
        for(String car : Cars){
            System.out.println(car);
        }

        System.out.println("####################################");

        Cars.remove("BMW");
        for(String car : Cars){
            System.out.println(car);
        }

        System.out.println("*******************************************");
        boolean empty = Cars.isEmpty();
        System.out.println(empty);
        System.out.println( );

        Cars.clear();
        System.out.println(Cars);
    }
}

package Day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MethodRefrecesDemo {
    public static void main(String[] args) {
        // :: method reference to static method
        List<String> names = Arrays.asList("A","B","C");

        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));  // for accessin the arry using for loop
        }

        for (String name : names) {
            System.out.print(name);  // for accessing the array using for-each loop
        }
    }
}

package Day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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

        System.out.println("######################### fou using refrence for each ");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}

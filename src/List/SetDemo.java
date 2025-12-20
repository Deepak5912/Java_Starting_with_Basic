package List;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> se = new HashSet<>();
        se.add("a");
        se.add("b");
        se.add("a");
        se.add(null);
        for (String s : se){
            System.out.println(s);
        }
    }

}

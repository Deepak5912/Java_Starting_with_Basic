package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("perfomring here list operations");
        List users = new ArrayList<>();
        users.add("deepak");
        users.add("rajesh");
        users.add(1);
        users.add(6.5f);
        for (int i = 0; i< users.size();i++){
            System.out.println(users.get(i));
        }

        System.out.println(" ");

        for(Object user :users){
            System.out.println(user);
        }
    }
}

package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {
        List <String> users = new ArrayList<>();
        users.add("John");
        users.add("Jane");
        users.add("Bob");
        users.add("Alice");
        System.out.println(users.get(0));

        System.out.println(" ************************************************************************************" +
                "");


        System.out.println("using for each loop )");
        for (String user : users){
            System.out.println(user);
        }


        System.out.println("########################## using for loop ###################################");
        for (int i=0; i<users.size();i++){
            System.out.println(users.get(i));
        }


        System.out.println("######################### Iterator  ############################");

        Iterator<String> it = users.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if (it.next().equals("Jane")){
                it.remove();
            }
        }
    }
}

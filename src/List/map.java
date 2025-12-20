package List;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map <Integer, String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.replace(3,"c");
        map.put(4,"d");
        for(int i = 0;i<=map.size();i++){
            System.out.println(map.get(i));
        }

    }
}

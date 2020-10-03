import model.Wagon;

import java.util.HashMap;
import java.util.Map;

public class Run {

    public static void main(String[] args) {
        Map<String,Integer> my = new HashMap<String, Integer>();
        my.put("SW",1);
        my.put("KP",2);
        my.put("PL",3);
        Wagon type = new Wagon(my);

        System.out.println(type.toString(2));
        type.allTypes();
    }
}

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap();
        map.put("India",120);
        map.put("china",150);
        map.put("usa",30);


        System.out.println(map.containsKey("India"));
        System.out.println(map.get("India"));

        for(Map.Entry<String,Integer> e : map.entrySet()){

            System.out.println(e.getKey());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }


        map.remove("china");
        System.out.println(map);

    }
}
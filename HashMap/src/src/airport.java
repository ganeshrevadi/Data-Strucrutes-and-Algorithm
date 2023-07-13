import java.util.HashMap;
import java.util.HashSet;

public class airport {

    public static String getStart(HashMap<String,String> tick){
        HashMap<String , String> revTick = new HashMap<>();
        for(String key : tick.keySet()){
            revTick.put(tick.get(key),key);
        }
        for(String key : tick.keySet()){
            if(!revTick.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("chen","blr");
        tickets.put("Mum","Del");
        tickets.put("Goa","chen");
        tickets.put("Del","Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}

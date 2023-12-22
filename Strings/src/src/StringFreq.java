import java.util.*;

public class StringFreq {
    public static void main(String[] args) {
        System.out.println(solve("abbhuabcfghh"));

    }
    public static String solve(String sorted) {
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < sorted.length(); i++) {
            if(map.containsKey(sorted.charAt(i))){
                map.put(sorted.charAt(i) , map.get(sorted.charAt(i)) + 1);
            }
            else{
                map.put(sorted.charAt(i) , 1);
            }
        }

        StringBuilder s = new StringBuilder();
        for(Character key : map.keySet()){
            s.append(key);
            s.append(map.get(key));
        }
        return s.toString();
    }
}

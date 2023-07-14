import java.util.HashMap;
import java.util.Set;

public class validAnagram {
    public static void main(String[] args) {
        String s = "aa";
        String t = "a";

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        HashMap<String,Integer> map = new HashMap<String, Integer>();
        HashMap<String,Integer> map2 = new HashMap<String, Integer>();

        for (int i = 0; i < ch1.length; i++) {
            if(map.containsKey(ch1[i])){
                map.put(String.valueOf(ch1[i]),map.get(ch1[i]) + 1);

            }
            else {
                map.put(String.valueOf(ch1[i]), 1);
            }
        }
        for (int i = 0; i < ch2.length; i++) {
            if(map2.containsKey(ch2[i])){
                map2.put(String.valueOf(ch2[i]),map2.get(ch2[i]) + 1);

            }
            else {
                map2.put(String.valueOf(ch2[i]), 1);
            }
        }


//        for(String key : map.keySet()) {
//            for (String key2 : map2.keySet()) {
//                if (key  == key2 && map.get(key) == map2.get(key2)) {
//                    System.out.println("Anagram");
//                } else {
//                    System.out.println(" Not Anagram");
//                }
//            }
//        }

        boolean ans = map.equals(map2);
        System.out.println(ans);

    }
}

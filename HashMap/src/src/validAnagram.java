import java.util.HashMap;
import java.util.Set;

public class validAnagram {
    public static void main(String[] args) {
        String s = "aa";
        String t = "a";

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (char c : ch1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : ch2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

//        System.out.println(map);
//        for (int i = 0; i < ch2.length; i++) {
//            if(map2.containsKey(ch2[i])){
//                map2.put(String.valueOf(ch2[i]),map2.get(ch2[i]) + 1);
//
//            }
//            else {
//                map2.put(String.valueOf(ch2[i]), 1);
//            }
//        }
//        System.out.println(map2);

        boolean ans = map.equals(map2);
        System.out.println(ans);
    }
}

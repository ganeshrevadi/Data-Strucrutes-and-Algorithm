import java.util.LinkedHashMap;

public class firstUniqueChar {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

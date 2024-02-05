import java.util.HashMap;

public class DecodeMessage {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        char ch = 'a';
        HashMap<Character , Character> map = new HashMap<>();
        for(char c : key.toCharArray()){
            if(map.containsKey(c)){
                map.put(c , map.get(c));
            }
            else{
                map.put(c , ch);
                ch = (char)((int)ch + 1);
            }
        }
        System.out.println(map);
        return "";
    }
}

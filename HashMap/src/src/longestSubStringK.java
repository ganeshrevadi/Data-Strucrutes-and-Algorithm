import java.util.HashMap;

public class longestSubStringK {
    public static void main(String[] args) {
        String str = "aaabb";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
            else {
                map.put(ch[i],1);
            }
        }
        int sum = 0;
        for(char key : map.keySet()){
            if(map.get(key) >= 3){
                sum += map.get(key);
            }
        }
        System.out.println(sum);
    }
}

import java.util.HashMap;

public class FrequencySort {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(max > 0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        while (!map.isEmpty()) {
            char maxFreqChar = '\0';
            int maxFreq = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxFreqChar = entry.getKey();
                }
            }
            for (int i = 0; i < maxFreq; i++) {
                sb.append(maxFreqChar);
            }
            map.remove(maxFreqChar);
        }
        return sb.toString();
    }
}

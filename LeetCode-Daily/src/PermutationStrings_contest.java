import java.util.*;
public class PermutationStrings_contest {
    public static void main(String[] args) {
        int ans = findPermutationDifference("abcde", "edbac");
        System.out.println(ans);

    }


    public static int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.toCharArray().length; i++){
            map1.put(s.charAt(i), i);
        }

        for(int i = 0; i < t.toCharArray().length; i++){
            map2.put(t.charAt(i), i);
        }


        int sum = 0;

        for(char c : s.toCharArray()){
            sum += Math.abs(map1.get(c) - map2.get(c));
        }

        return sum;
    }
}

import java.util.*;
public class subStingLongest {
    public static void main(String[] args) {
        HashMap<Character , Integer> map = new HashMap<Character,Integer>();
        String s = "abcabcbb";
        int left = 0,right = 0;
        int n = s.length();
        int len = 0;

        while(right < n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) + 1,left);
            }

            map.put(s.charAt(right),right);
            len  = Math.max(len,right - left + 1);
            right++;
        }
        System.out.println(len);

    }
}
dospfllksf;ksd;flk;sldfk;lksd;lfk;sldfk;lsd  k;ls fd][;
';'ks;df;skdflkjslfdkjsldkfjlskdjflksdjflksjdflkjsdlfk  o iljk ganesh revadi here i am writig everything about my life
        ]
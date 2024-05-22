import java.util.HashSet;

public class minAnagram {
    public static void main(String[] args) {
        System.out.println(minAnagramLen("cdef"));
    }


    public static int minAnagramLen(String s){
        StringBuilder s1 = new StringBuilder();
        HashSet<Character> map = new HashSet<>();
        for(char c : s.toCharArray()){
            map.add(c);
        }
        System.out.println(map.toArray().toString());

        return map.size();
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MaxLenConCatStr {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("un");
        lis.add("iq");
        lis.add("ue");
        System.out.println(maxLength(lis));
    }

    public static int maxLength(List<String> arr) {
        HashSet<Character> map = new HashSet<>();
        for(String ele : arr){
            for (int i  = 0 ; i < ele.length();i++){
                map.add(ele.charAt(i));
            }
        }
        System.out.println(map);
        return map.size();
    }
}

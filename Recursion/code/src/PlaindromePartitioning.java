import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaindromePartitioning {
    public static void main(String[] args) {
        String arr = "aab";
        System.out.println(permute(arr));
    }

    public static List<List<String>> permute(String arr) {
        List<List<String>> res = new ArrayList<>();
        helper(arr,res,new ArrayList<>());
        return res;
    }

    public static  void helper(String nums , List<List<String>> res,List<String> arr){

        if(arr.size() == nums.length()){
            if(!res.contains(arr) && isPal(arr)){
                res.add(new ArrayList<>(arr));
            }
            return;
        }

        for(int i = 0  ; i< nums.length(); i++){
            if(!arr.contains(nums.charAt(i))) {
                arr.add(String.valueOf(nums.charAt(i)));
                helper(nums, res, arr);
                arr.remove(arr.size() - 1);
            }
        }
    }

    public static boolean isPal(List<String> str){
        String revStr = new String(String.valueOf(str));
        Collections.reverse(Collections.singletonList(revStr));
        if(revStr.equalsIgnoreCase(String.valueOf(str))){
            return true;
        }
        return false;
    }


}

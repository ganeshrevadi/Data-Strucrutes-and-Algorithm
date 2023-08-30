import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        helper(arr,res,new ArrayList<>());
        return res;
    }

    public static  void helper(int[] nums , List<List<Integer>> res,List<Integer> arr){

        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int i = 0  ; i< nums.length; i++){
            if(!arr.contains(nums[i])) {
                arr.add(nums[i]);
                helper(nums, res, arr);
                arr.remove(arr.size() - 1);

            }
        }
    }

    public static boolean isPal(ArrayList<String> str){

        return true;
    }
}

import java.util.*;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {3,1,-1,0,1};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr){
            nums.add(i);
        }
        helper(nums,res,new ArrayList<>());
        return res;
    }

    public static  void helper(ArrayList<Integer> nums , List<List<Integer>> res,List<Integer> arr){

        if(nums.size() == 0){
            if(!res.contains(arr)){
                res.add(new ArrayList<>(arr));
            }
            return;
        }

        for(int i = 0  ; i< nums.size(); i++){
                arr.add(nums.get(i));
                int temp = nums.get(i);
                nums.remove(nums.get(i));
                helper(nums, res, arr);
                nums.add(i,temp);
                arr.remove(arr.size() - 1);
        }
    }
}

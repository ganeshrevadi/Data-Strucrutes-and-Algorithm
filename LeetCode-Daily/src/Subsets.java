import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList();
        generateSub(0,nums,new ArrayList(),res);
        return res;
    }

    static void generateSub(int index,int[] nums, List<Integer> curr,List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        //NotPick
        generateSub(index + 1, nums, curr, res);

        // Pick
        curr.add(nums[index]);
        generateSub(index + 1, nums, curr, res);
        curr.remove(curr.size() - 1);

        return;
    }
}

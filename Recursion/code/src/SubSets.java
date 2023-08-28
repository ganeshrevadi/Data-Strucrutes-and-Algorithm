import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList();
        generateSub(0,nums,new ArrayList(),res);
        return res;
    }

    static void generateSub(int index,int[] nums, List<Integer> curr,List<List<Integer>> res){
        res.add(new ArrayList(curr));

        for(int i = index;i<nums.length;i++){
            curr.add(nums[i]);
            generateSub(i+1,nums,curr,res);
            curr.remove(curr.size() - 1);
        }
    }
}

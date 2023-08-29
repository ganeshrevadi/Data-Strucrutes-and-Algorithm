import java.util.*;
import java.util.Comparator;


public class combinationSumII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 30;
        System.out.println(combinationSum2(nums,target));
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i : candidates) {
            arr.add(i);
        }
        findCombination(0,arr,target,ans,new ArrayList<>());
        return ans;
    }


    private static void findCombination(int ind, ArrayList<Integer> arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0){
            if(!ans.contains(ds)){
                ans.add(new ArrayList(ds));
                return;
            }

        }


        if(target < 0){
            return;
        }

        for (int i = ind; i < arr.size(); i++) {
            ds.add(arr.get(i));
            int temp = arr.get(i);
            arr.remove(arr.get(i));
            findCombination(i,arr,target - temp,ans,ds);
            arr.add(i,temp);
            ds.remove(ds.size() - 1);
        }
    }

}

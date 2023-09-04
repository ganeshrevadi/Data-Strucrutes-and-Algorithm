import java.util.*;

public class combinationSumII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 30;
        System.out.println(combinationSum2(nums,target));
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }


    private static void findCombination(int ind, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates
            }

            if (candidates[i] > target) {
                break; // Since the array is sorted, further elements will also be too large
            }

            ds.add(candidates[i]);
            findCombination(i + 1, candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}

import java.util.*;
import java.util.Comparator;

class ListComparator implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> list1, List<Integer> list2) {
        // Compare the first elements of the lists for sorting
        return Integer.compare(list1.get(0), list2.get(0));
    }
}

public class combinationSumII {
    public static void main(String[] args) {
        int[] nums = {5,4,5,1,5,3,1,4,5,5,4};
        int target = 10;
        System.out.println(combinationSum2(nums,target));
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            arr.add(candidates[i]);
        }
        findCombination(0,arr,target,ans,new ArrayList<>());
        return ans;
    }


    private static void findCombination(int ind, ArrayList<Integer> arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0){
            ArrayList<Integer> res = new ArrayList<>(ds);
            Collections.sort(res);
            if(!ans.contains(res)){
                ans.add(new ArrayList(res));
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

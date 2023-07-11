import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        System.out.println(ans);
    }

    private static void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans,
                                        List<Integer> ds) {

        if(target == 0) ans.add(new ArrayList(ds));

        if(target < 0){
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            ds.add(arr[i]);
            findCombination(i,arr,target - arr[i],ans,ds);
            ds.remove(ds.size() -1);
        }
    }
}

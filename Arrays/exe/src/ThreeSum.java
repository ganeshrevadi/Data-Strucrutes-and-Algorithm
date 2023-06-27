import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int  i = 0;i<nums.length - 1; i++){
            for(int j = i + 1;j<nums.length;j++){
                for(int k = j + 1;k<nums.length ;k++){
                    if(nums[i] + nums[j] + nums[k] == 0 && i != k && i != j && j!= k){
                        List<Integer> re = new ArrayList<>();
                        re.add(nums[i]);
                        re.add(nums[j]);
                        re.add(nums[k]);
                        Collections.sort(re);
                        s.add(re);
                    }
                }
            }
        }
        ans.addAll(s);
        System.out.println(ans);
    }
}

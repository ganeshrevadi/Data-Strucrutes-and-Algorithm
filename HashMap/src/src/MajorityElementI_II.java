import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementI_II {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int n = 3;

        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3 ){
                result.add(key);
            }
        }
        System.out.println(result);
    }
}

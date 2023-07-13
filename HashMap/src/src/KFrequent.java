import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class KFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int n = 3;
        int k = 2;

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
           result.add(map.get(key));
        }
        System.out.println(result);
        Collections.sort(result, Collections.reverseOrder());
        System.out.println(result);


        Integer[] integerArray = result.toArray(new Integer[0]);
        int[] intArray = new int[k];
        for (int i = 0; i < k; i++) {
            intArray[i] = integerArray[i].intValue();
        }
        System.out.println(Arrays.toString(intArray));
    }
}

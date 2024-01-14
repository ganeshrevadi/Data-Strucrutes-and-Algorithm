import java.util.*;
public class maxFreqEle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2};
        System.out.println(maxFrequencyElements(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        int freq = 0;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                freq = max;
            }
            else if(map.get(key) == max){
                freq += max;
            }
        }
        return freq;
    }
}

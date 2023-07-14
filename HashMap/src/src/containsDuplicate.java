import java.util.*;
public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                System.out.println(false);
            }
            else{
                map.put(nums[i],1);
            }

        }
        System.out.println(true);
    }
}

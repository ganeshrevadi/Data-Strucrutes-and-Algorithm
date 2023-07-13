import java.util.*;
public class FindMissingPos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        Arrays.sort(nums);
        if (nums[0] > 0 && nums[0] != 1) {
            System.out.println(1);
        }
        if (nums[0] == 1 && nums[nums.length - 1] == nums.length) {
            System.out.println(nums.length + 1);
        }
        int res = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i - 1]++ && nums[i] > 0) {
                res = nums[i]++;
                res++;
            }
        }
        System.out.println(res);
    }
}

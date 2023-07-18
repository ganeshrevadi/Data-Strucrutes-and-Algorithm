import java.util.Arrays;

public class missingPositive {
    public static void main(String[] args) {
        int[] rest = {3,4,-1,1};
        Arrays.sort(rest);
        int[] nums = new int[3];
        int j = 0;
        for (int i = 0; i < rest.length; i++) {
            if(rest[i] > 0){
                nums[j++] = rest[i];
            }
        }

        if(nums[0] > 0 && nums[0] != 1){
            System.out.println(1);
        }
        if(nums[0] == 0 && nums[nums.length - 1] == nums.length - 1){
            System.out.println(nums.length);
        }
        if(nums[0] == 1 && nums[nums.length - 1] == nums.length){
            System.out.println(nums.length + 1);
        }
        int res = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i - 1]++ && nums[i] > 0) {
                res = nums[i- 1]++;
            }
        }

        System.out.println(res);
    }
}
